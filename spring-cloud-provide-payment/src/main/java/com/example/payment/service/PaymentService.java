package com.example.payment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.apicommons.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
* @author dingguozhao
* @description 针对表【payment】的数据库操作Service
* @createDate 2022-12-07 15:41:15
*/
public interface PaymentService extends IService<Payment> {
    /**
     * 插入信息
     *
     * @param payment
     * @return
     */
    int insert(Payment payment);

    /**
     * 根据 ID 查找
     *
     * @param id
     * @return
     */
    Payment findById(@Param("id") long id);
}
