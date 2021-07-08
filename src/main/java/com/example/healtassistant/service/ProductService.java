package com.example.healtassistant.service;

import com.example.healtassistant.DAO.ProductDAO;
import com.example.healtassistant.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductDAO productDAO;

    public Product createProduct(Product product){ return productDAO.save(product); }

    public List<Product> getProducts(){
        return productDAO.findAll();
    }

}
