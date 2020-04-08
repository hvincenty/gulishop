package com.hilsion.gulishop.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GulishopCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulishopCouponApplication.class, args);
    }

}
