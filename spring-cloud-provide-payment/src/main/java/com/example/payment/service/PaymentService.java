package com.example.payment.service;

import com.example.apicommons.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 支付接口
 *
 * @author 丁国钊
 * @date 2022-12-6
 */
public interface PaymentService {
    /**
     * 构造
     *
     * @param payment
     * @return
     */
    int create(Payment payment);
    /**
     * 根据 ID 查询
     *
     * @param id
     * @return
     */
    Payment queryById(@Param("id")long id);
}
