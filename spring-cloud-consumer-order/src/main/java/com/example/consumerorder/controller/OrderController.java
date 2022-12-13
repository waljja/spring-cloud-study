package com.example.consumerorder.controller;

import com.example.apicommons.entity.CommonResult;
import com.example.apicommons.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 丁国钊
 * @date 2022-12-8
 */
@Slf4j
@RestController
@RequestMapping(value = "/consumer")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    /** 支付服务调用 URL */
    public static final String PAYMENT_URL = "http://localhost:8082";

    /**
     * 创建支付订单
     *
     * @param payment
     * @return
     */
    @GetMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create/", payment, CommonResult.class);
    }

    /**
     * 获取支付订单
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        System.out.println(PAYMENT_URL + "/payment/get/" + id);
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
