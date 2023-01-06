package com.example.payment.service.impl;

import com.example.apicommons.entity.CommonResult;
import com.example.apicommons.entity.Payment;
import com.example.apicommons.service.DubboApiService;
import com.example.payment.mapper.PaymentMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 丁国钊
 * @date 2022-12-15
 */
@Slf4j
@DubboService
public class DubboApiServiceImpl implements DubboApiService {
    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public CommonResult<Payment> getPayment(long id) {
        Payment payment = paymentMapper.findOneById(id);

        log.info("查询成功" + payment);

        if (payment!=null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, "查询失败", null);
        }
    }
}
