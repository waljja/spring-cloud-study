package com.example.payment.controller;

import com.example.apicommons.entity.CommonResult;
import com.example.apicommons.entity.Payment;
import com.example.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 支付
 *
 * @author 丁国钊
 * @date 2022-12-6
 */
@Slf4j
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment dept){
        int i = paymentService.insert(dept);

        log.info("插入成功"+i);

        if(i>0){
            return new CommonResult(200, "插入数据库成功", i);
        }else{
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult queryById(@PathVariable("id") long id) {
        Payment payment = paymentService.findById(id);

        log.info("查询成功" + payment);

        if (payment!=null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, "查询失败", null);
        }
    }
}
