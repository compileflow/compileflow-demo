package com.alibaba.compileflow.demo.mock;

import org.springframework.stereotype.Component;

/**
 * Mock一个SpringBean
 *
 * @author xuan
 * @since 2020/8/16
 */
@Component("mockSpringBean")
public class MockSpringBean {

    public void sing(String name) {
        System.out.println(name + " is singing");
    }

    public void payMoney(int price) {
        System.out.println("actually paid money: " + price);
    }
}
