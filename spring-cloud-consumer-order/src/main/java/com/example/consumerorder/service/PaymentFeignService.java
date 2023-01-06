package com.example.consumerorder.service;

import com.example.apicommons.entity.CommonResult;
import com.example.apicommons.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 丁国钊
 * @date 2022-12-13
 */
@Component
@FeignClient(name = "service-payment")
public interface PaymentFeignService {
    /**
     * 创建支付订单
     *
     * @param payment
     * @return
     */
    @GetMapping("/payment/create")
    CommonResult<Payment> create(Payment payment);

    /**
     * 获取支付订单
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") Long id);
}
