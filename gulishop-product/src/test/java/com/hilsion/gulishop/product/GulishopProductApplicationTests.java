package com.hilsion.gulishop.product;

import com.hilsion.gulishop.product.entity.BrandEntity;
import com.hilsion.gulishop.product.service.BrandService;
import com.hilsion.gulishop.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulishopProductApplicationTests {

    @Autowired
    CategoryService service;

    @Test
    void contextLoads() {


        System.out.println(service.listWithTree());
    }

}
