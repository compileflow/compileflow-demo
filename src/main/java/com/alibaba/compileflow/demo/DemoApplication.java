package com.alibaba.compileflow.demo;

import com.alibaba.compileflow.engine.process.preruntime.generator.bean.SpringApplicationContextProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author xuan
 * @since 2020/8/16
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("DemoApplication start ok!!!");
    }

}
