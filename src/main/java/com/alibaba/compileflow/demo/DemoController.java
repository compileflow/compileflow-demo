package com.alibaba.compileflow.demo;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuan
 * @since 2020/8/16
 */
@RestController
public class DemoController {

    @Resource
    private RunCase runCase;

    @RequestMapping("/say")
    public String say() {
        return "Hello,compileflow.";
    }

    @RequestMapping("/run")
    public String run() {
        runCase.run();
        return "Run ok.";
    }

    @RequestMapping("/run2")
    public String run2() {
        runCase.run2();
        return "Run ok.";
    }

}
