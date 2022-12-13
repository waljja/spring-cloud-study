package com.example.consumerorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 丁国钊
 * @date 2022-12-8
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringCloudConsumerOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerOrderApplication.class, args);
    }

}
