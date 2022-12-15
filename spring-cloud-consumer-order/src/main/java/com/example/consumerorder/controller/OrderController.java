package com.example.consumerorder.controller;

import com.example.apicommons.entity.CommonResult;
import com.example.apicommons.entity.Payment;
import com.example.apicommons.service.DubboApiService;
import com.example.consumerorder.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 丁国钊
 * @date 2022-12-8
 */
@Slf4j
@RestController
@RequestMapping(value = "/consumer")
public class OrderController {
    @Autowired
    PaymentFeignService orderService;

    /** 引入服务提供方的服务接口 */
    @DubboReference
    DubboApiService dubboApiService;

    /**
     * 创建支付订单
     *
     * @param payment
     * @return
     */
    @GetMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return orderService.create(payment);
    }

    /**
     * 获取支付订单
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return dubboApiService.getPayment(id);
    }
}
