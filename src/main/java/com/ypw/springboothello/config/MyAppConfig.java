package com.ypw.springboothello.config;

import com.ypw.springboothello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyAppConfig
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/21 9:51
 * @Version 1.0
 **/
@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService() {
        System.out.println("添加helloService.....");
        return new HelloService();
    }
}
