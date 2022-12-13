package com.example.apicommons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author dgz
 * @date 2022-12-8
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringCloudApiCommonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApiCommonsApplication.class, args);
    }

}
