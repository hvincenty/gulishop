package com.hilsion.gulishop.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GulishopProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulishopProductApplication.class, args);
    }

}
