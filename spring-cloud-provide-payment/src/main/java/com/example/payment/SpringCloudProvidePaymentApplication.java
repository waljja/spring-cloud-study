package com.example.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 丁国钊
 * @date 2022-12-7
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.payment.mapper")
public class SpringCloudProvidePaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvidePaymentApplication.class, args);
    }

}
