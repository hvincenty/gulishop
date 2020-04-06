package com.hilsion.gulishop.product;

import com.hilsion.gulishop.product.entity.BrandEntity;
import com.hilsion.gulishop.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulishopProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("来上课");
        brandService.save(brandEntity);
        System.out.println("ok");
    }

}
