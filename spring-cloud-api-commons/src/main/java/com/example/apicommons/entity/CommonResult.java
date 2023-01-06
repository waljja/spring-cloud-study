package com.example.apicommons.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 统一返回信息对象
 *
 * @author 丁国钊
 * @date 2022-12-5
 */
@Setter
@Getter
@NoArgsConstructor
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResult<T> failed() {
        return new CommonResult<>(ResultEnum.FAILED.getCode(), ResultEnum.FAILED.getMessage(), null);
    }
}
