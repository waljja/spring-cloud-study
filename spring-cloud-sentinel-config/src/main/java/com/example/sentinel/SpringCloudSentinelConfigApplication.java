package com.example.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 丁国钊
 * @date 2022-12-20
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudSentinelConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSentinelConfigApplication.class, args);
    }

}
