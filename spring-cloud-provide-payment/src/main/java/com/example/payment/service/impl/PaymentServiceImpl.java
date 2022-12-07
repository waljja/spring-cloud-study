package com.example.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apicommons.entity.Payment;
import com.example.payment.service.PaymentService;
import com.example.payment.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author dingguozhao
* @description 针对表【payment】的数据库操作Service实现
* @createDate 2022-12-07 15:41:15
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment findById(long id) {
        return paymentMapper.findOneById(id);
    }
}




