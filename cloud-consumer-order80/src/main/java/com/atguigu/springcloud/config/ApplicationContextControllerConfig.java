package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: cola
 * @Created: cola on 2020/7/23 17:35
 * @Version 1.0
 */
@Configuration
public class ApplicationContextControllerConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemple(){
        return new RestTemplate();
    }
}
