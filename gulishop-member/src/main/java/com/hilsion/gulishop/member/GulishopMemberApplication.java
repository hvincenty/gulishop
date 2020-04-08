package com.hilsion.gulishop.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.hilsion.gulishop.member.feign")
public class GulishopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulishopMemberApplication.class, args);
    }

}
