package com.poc.springbootredis.service;

import com.poc.springbootredis.entity.Product;
import com.poc.springbootredis.repository.ProductRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    @Cacheable(value = "product", key="#id")
    public Optional<Product> getProduct(int id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    @CacheEvict(value="product", key="#id")
    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "product successfully deleted";
    }
}
