package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.dao.BrandDao;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setName("HuaWei");
        brandService.save(brand);
        System.out.println("test----");
    }

    @Test
    void delete(){
        BrandEntity byId = brandService.getById(1L);
        System.out.println("brand:"+byId);
        brandService.removeById(1L);
        System.out.println("test--------");
    }

}
