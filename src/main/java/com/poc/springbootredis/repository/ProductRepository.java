package com.poc.springbootredis.repository;

import com.poc.springbootredis.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
