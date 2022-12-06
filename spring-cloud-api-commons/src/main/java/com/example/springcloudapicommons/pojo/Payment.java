package com.example.springcloudapicommons.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 支付实体类
 *
 * @author 丁国钊
 * @date 2022-12-5
 */
@Setter
@Getter
public class Payment implements Serializable {
    private long id;
    private String serial;
}
