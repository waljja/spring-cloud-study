package com.example.apicommons.service;

import com.example.apicommons.entity.CommonResult;
import com.example.apicommons.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Dubbo RPC 调用服务接口
 *
 * @author 丁国钊
 * @date 2022-12-15
 */
public interface DubboApiService {
    /**
     * 获取支付信息
     *
     * @param id
     * @return
     */
    CommonResult<Payment> getPayment(@Param("id") long id);
}
