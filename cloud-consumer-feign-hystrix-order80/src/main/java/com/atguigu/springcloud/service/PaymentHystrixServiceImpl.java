package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: cola
 * @Created: cola on 2020/7/27 15:35
 * @Version 1.0
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "异常处理信息，请稍后再试,(┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "异常处理信息，请稍后再试,(┬＿┬)";
    }
}
