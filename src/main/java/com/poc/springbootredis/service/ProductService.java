package com.poc.springbootredis.service;

import com.poc.springbootredis.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product save(Product product);
    Optional<Product> getProduct(int id);
    List<Product> getAllProducts();
    String deleteProduct(int id);
}
