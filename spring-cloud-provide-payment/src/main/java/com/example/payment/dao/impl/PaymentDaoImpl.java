package com.example.payment.dao.impl;

import com.example.apicommons.entity.Payment;
import com.example.payment.dao.PaymentDao;
import com.example.payment.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 丁国钊
 * @date 2022-12-15
 */
public class PaymentDaoImpl implements PaymentDao {
    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public Payment findById(long id) {
        return paymentMapper.findOneById(id);
    }
}
