package com.poc.springbootredis.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@RedisHash("Product")
@Entity

@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private int quantity;
}
