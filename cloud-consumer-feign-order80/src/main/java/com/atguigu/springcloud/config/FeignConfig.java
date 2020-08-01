package com.atguigu.springcloud.config;

/**
 * @Author: cola
 * @Created: cola on 2020/7/26 17:53
 * @Version 1.0
 */
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}

