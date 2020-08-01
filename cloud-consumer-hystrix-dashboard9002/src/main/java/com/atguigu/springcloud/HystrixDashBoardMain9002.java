package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: cola
 * @Created: cola on 2020/7/28 13:48
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardMain9002.class,args);
    }
}
