package com.alibaba.compileflow.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.compileflow.engine.ProcessEngine;
import com.alibaba.compileflow.engine.ProcessEngineFactory;

import org.springframework.stereotype.Component;

/**
 * @author xuan
 * @since 2020/8/16
 */
@Component
public class RunCase {

    public void run() {
        //code在bpm文件中定义
        String code = "bpm.ktvExample";

        //执行流程的入参
        Map<String, Object> context = new HashMap<>();
        List<String> pList = new ArrayList<>();
        pList.add("wuxiang");
        pList.add("yusu");
        pList.add("xugong");
        pList.add("fandu");
        context.put("pList", pList);

        try {
            ProcessEngine processEngine = ProcessEngineFactory.getProcessEngine();
            Map<String, Object> result = processEngine.start(code, context);
            System.out.println(result.get("price"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run2() {
        //code在bpm文件中定义
        String code = "bpm.sqrt";

        //执行流程的入参
        Map<String, Object> context = new HashMap<>();
        context.put("num", 4);

        try {
            ProcessEngine processEngine = ProcessEngineFactory.getProcessEngine();
            Map<String, Object> result = processEngine.start(code, context);
            System.out.println(result.get("numSqrt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
