package com.atguigu.springcloud.service;


import com.atguigu.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: cola
 * @Created: cola on 2020/7/23 10:30
 * @Version 1.0
 */
public interface PaymentService {

    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
