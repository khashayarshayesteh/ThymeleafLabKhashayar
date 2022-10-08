package com.canon.spring05thymeleaf.repository;


import com.canon.spring05thymeleaf.model.Product;
import com.canon.spring05thymeleaf.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepository {
    boolean save(Product product);

    Product findProductById(UUID productId);

    List<Product> findAll();
}
