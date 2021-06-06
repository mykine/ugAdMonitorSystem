package com.demoproject.demoaopapi;

import com.demoproject.demoaopapi.domain.Product;
import com.demoproject.demoaopapi.sercurity.CurrentUserHolder;
import com.demoproject.demoaopapi.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoAopApiApplicationTests {

    @Autowired
    ProductService productService;

    @Test
    public void adminInsert() {
        CurrentUserHolder.set("abc");
        productService.insert(new Product("产品"));
        System.out.println("123");
    }

}
