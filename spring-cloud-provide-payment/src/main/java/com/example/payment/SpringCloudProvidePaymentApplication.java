package com.example.payment;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @author 丁国钊
 * @date 2022-12-7
 */
@EnableDubbo
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.payment.mapper")
public class SpringCloudProvidePaymentApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCloudProvidePaymentApplication.class, args);
        while(true) {
            String userName = applicationContext.getEnvironment().getProperty("user.name");
            String userAge = applicationContext.getEnvironment().getProperty("user.age");
            System.err.println("user name :" + userName + "; age: " + userAge);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                System.out.println("configException: " + e);
            }
        }
    }

}
