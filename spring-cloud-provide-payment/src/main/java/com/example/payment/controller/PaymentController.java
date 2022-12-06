package com.example.payment.controller;

import com.example.apicommons.pojo.CommonResult;
import com.example.apicommons.pojo.Payment;
import com.example.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付
 *
 * @author 丁国钊
 * @date 2022-12-6
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") long id) {
        Payment payment = paymentService.queryById(id);
        
        log.info("查询成功" + payment);
        if (payment!=null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, "查询失败", null);
        }
    }
}
