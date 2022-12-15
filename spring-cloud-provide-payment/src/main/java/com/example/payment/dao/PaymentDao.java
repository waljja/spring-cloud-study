package com.example.payment.dao;

import com.example.apicommons.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 针对表 payment 的数据库操作 Service
 *
 * @author dingguozhao
 * @createDate 2022-12-07 15:41:15
 */
public interface PaymentDao {
    /**
     * 根据 ID 查找
     *
     * @param id
     * @return
     */
    Payment findById(@Param("id") long id);
}
