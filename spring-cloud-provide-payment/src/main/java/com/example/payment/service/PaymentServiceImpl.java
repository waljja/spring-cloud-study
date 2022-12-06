package com.example.payment.service;

import com.example.apicommons.pojo.Payment;
import com.example.payment.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 支付逻辑实现类，调用 dao 方法访问数据库
 *
 * @author 丁国钊
 * @date 2022-12-6
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
