package com.hilsion.gulishop.member.feign;

import com.hilsion.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulishop-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/test")
    R memberTest();
}
