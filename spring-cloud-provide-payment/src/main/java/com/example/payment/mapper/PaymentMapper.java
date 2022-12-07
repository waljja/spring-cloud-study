package com.example.payment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.apicommons.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @author dingguozhao
* @description 针对表【payment】的数据库操作Mapper
* @createDate 2022-12-07 15:41:15
* @Entity generator.entity.Payment
*/
@Mapper
@Repository
public interface PaymentMapper extends BaseMapper<Payment> {
    /**
     * 插入记录
     *
     * @param payment
     * @return
     */
    int insertSelective(Payment payment);

    /**
     * 根据 ID 查找
     *
     * @param id
     * @return
     */
    Payment findOneById(@Param("id") Long id);
}




