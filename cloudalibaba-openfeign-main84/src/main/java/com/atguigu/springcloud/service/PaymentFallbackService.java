package com.atguigu.springcloud.service;

import com.atguigu.springCloud.entities.CommonResult;
import com.atguigu.springCloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: cola
 * @Created: cola on 2020/8/10 8:40
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级,------PaymentFallbackService",new Payment(id,"error"));
    }
}
