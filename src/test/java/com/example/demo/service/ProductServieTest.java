package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.MemoryProductRespository;
import com.example.demo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServieTest {
    ProductRepository productRepository = new MemoryProductRespository();
    ProductServie productServie = new ProductServie(productRepository);
    @Test
    void getAllProducts() {
    }
}