package com.example.payment.dao;

import com.example.apicommons.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 丁国钊
 * @date 2022-12-6
 */
@Mapper
@Repository
public interface PaymentDao {
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
