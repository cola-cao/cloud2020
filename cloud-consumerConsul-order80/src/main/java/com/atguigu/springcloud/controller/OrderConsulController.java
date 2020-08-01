package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: cola
 * @Created: cola on 2020/7/25 19:20
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderConsulController {

    private static final String INVOKE_URL = "http://consul-provider-payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);

        return result;
    }
}
