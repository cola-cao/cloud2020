package com.atguigu.springcloud.service.Impl;

import com.atguigu.springCloud.entities.Payment;
import com.atguigu.springcloud.dao.PaymentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: cola
 * @Created: cola on 2020/7/23 10:32
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl {
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment){

        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){

        return paymentDao.getPaymentById(id);
    }
}
