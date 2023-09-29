package com.poc.springbootredis.controller;

import com.poc.springbootredis.entity.Product;
import com.poc.springbootredis.repository.ProductRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableCaching
@RequestMapping("/product")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    @Cacheable(key = "#id", value = "Product")
    public Product getProduct(@PathVariable int id) {
        return productRepository.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productRepository.deleteById(id);
    }
}
