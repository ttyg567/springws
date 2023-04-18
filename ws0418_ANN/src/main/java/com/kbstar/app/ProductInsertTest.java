package com.kbstar.app;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductInsertTest {

    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");
        ProductService<String, ProductDTO> service =
                (ProductService<String, ProductDTO>) factory.getBean("pservice");
        ProductDTO p = new ProductDTO("고구마케이크", 20000, 100);
        service.register(p);
    }
}
