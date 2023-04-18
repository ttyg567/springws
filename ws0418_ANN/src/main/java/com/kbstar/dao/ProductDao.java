package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.ProductDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("pdao")
public class ProductDao implements ProductDAO<String, ProductDTO> {
    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle:"+ productDTO);
    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted Oracle:"+ s);
    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle:"+ productDTO);
    }

    @Override
    public ProductDTO select(String s) {
        ProductDTO product = null;
        product = new ProductDTO(s, 10000, 1000);
        return null;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list =  new ArrayList<>();
        list.add(new ProductDTO("고구마케익", 20000, 100));
        list.add(new ProductDTO("딸기케익", 30000, 50));
        list.add(new ProductDTO("치즈케익", 15000, 10));
        return null;
    }
}
