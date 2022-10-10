package com.canon.spring05thymeleaf.service.impl;


import com.canon.spring05thymeleaf.model.Product;
import com.canon.spring05thymeleaf.repository.ProductRepository;
import com.canon.spring05thymeleaf.service.ProductService;
import com.canon.spring05thymeleaf.model.Product;
import com.canon.spring05thymeleaf.repository.ProductRepository;
import com.canon.spring05thymeleaf.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean productCreate(Product product) {
        return productRepository.save(product);

    }

    @Override
    public List<Product> listProduct() {


        return productRepository.findAll();
    }

    @Override
    public Product findProductById(UUID uuid) {

        return productRepository.findProductById(uuid);
    }

}
