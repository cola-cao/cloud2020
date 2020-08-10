package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springCloud.entities.CommonResult;

/**
 * @Author: cola
 * @Created: cola on 2020/8/8 8:06
 * @Version 1.0
 */
public class CustomerBlockHandler {

    public  static CommonResult handleException1(BlockException exception) {
        return  new CommonResult(444,exception.getClass().getCanonicalName() + "\t 1号");
    }

    public  static CommonResult handleException2(BlockException exception) {
        return  new CommonResult(444,exception.getClass().getCanonicalName() + "\t 2号");
    }
}
