package com.alibaba.compileflow.demo.mock;

import com.alibaba.compileflow.engine.ProcessEngine;
import com.alibaba.compileflow.engine.ProcessEngineFactory;
import com.alibaba.compileflow.engine.process.preruntime.generator.bean.SpringApplicationContextProvider;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 注意：这里是想让系统启动时，预先加载bpm流程到内存，防止第一次调用时，初始化流程所带来的耗时
 *
 * @author xuan
 * @since 2020/8/16
 */
@Component
@Configuration
public class BpmInitializer implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        ProcessEngine processEngine = ProcessEngineFactory.getProcessEngine();
        processEngine.preCompile("bpm.ktvExample");
        processEngine.preCompile("bpm.sqrt");
    }

    @Bean
    public SpringApplicationContextProvider getSpringApplicationContextProvider() {
        return new SpringApplicationContextProvider();
    }

}
