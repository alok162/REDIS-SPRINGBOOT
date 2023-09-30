package com.poc.springbootredis.repository;

import com.poc.springbootredis.entity.Product;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRedisRepository {
//    public static final String HASH_KEY = "Product";
//    private final RedisTemplate redisTemplate;
//
//    public ProductRedisRepository(RedisTemplate redisTemplate) {
//        this.redisTemplate = redisTemplate;
//    }
//
//    public Product save(Product product) {
//        redisTemplate.opsForHash().put(HASH_KEY, product.getId(), product);
//        return product;
//    }
//
//    public List<Product> findAll() {
//        return redisTemplate.opsForHash().values(HASH_KEY);
//    }
//
//    public Product findProductById(int id) {
//        System.out.println("Called repository --->");
//        return (Product) redisTemplate.opsForHash().get(HASH_KEY, id);
//    }
//
//    public String deleteById(int id) {
//        redisTemplate.opsForHash().delete(HASH_KEY, id);
//        return "Product evicted";
//    }
}
