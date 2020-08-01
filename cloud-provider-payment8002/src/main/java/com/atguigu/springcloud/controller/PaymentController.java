package com.atguigu.springcloud.controller;

import com.atguigu.springCloud.entities.CommonResult;
import com.atguigu.springCloud.entities.Payment;
import com.atguigu.springcloud.service.Impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: cola
 * @Created: cola on 2020/7/23 10:38
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private PaymentServiceImpl paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果: " + result);
        if (result > 0){
            return new CommonResult(200,"ok,serverPort: " + serverPort,payment);
        }else{
            return new CommonResult(444,"fail",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment result = paymentService.getPaymentById(id);
        int i = 10/2;
        System.out.println("---------------:i=" + i);
        log.info("****输出结果: " + result);

        if (null != result){
            return new CommonResult(200,"ok,serverPort: " + serverPort,result);
        }else {
            return new CommonResult(444,"fail",null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("***** element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping("/payment/timeout")
    public String timeOut() throws InterruptedException {
        Thread.sleep(3000);

        return serverPort;
    }
}
