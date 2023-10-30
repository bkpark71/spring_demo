package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductServie productServie;

    @Autowired
    public ProductController(ProductServie productServie) {
        this.productServie = productServie;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productServie.getAllProducts();
    }
}
