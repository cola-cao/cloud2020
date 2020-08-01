package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: cola
 * @Created: cola on 2020/7/25 19:08
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain.class,args);
    }
}
