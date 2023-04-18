package com.kbstar.service;

import com.kbstar.dao.ProductDao;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.ProductDAO;
import com.kbstar.frame.ProductService;
import java.util.List;


public class ProductServiceSe implements ProductService<String, ProductDTO> {

    ProductDAO<String, ProductDTO> dao;

    public ProductServiceSe(ProductDao dao) { this.dao = dao;}


    @Override
    public void register(ProductDTO productDTO) {
            dao.insert(productDTO);
            System.out.println("Send Mail");

    }

    @Override
    public void remove(String s) {
        dao.delete(s);
    }

    @Override
    public void modify(ProductDTO productDTO) {
        dao.update(productDTO);
        System.out.println("Send Mail ..");

    }

    @Override
    public ProductDTO get(String s) {
        return dao.select(s);
    }

    @Override
    public List<ProductDTO> get() {
        return dao.select();
    }
}