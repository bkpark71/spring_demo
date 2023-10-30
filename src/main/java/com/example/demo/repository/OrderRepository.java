package com.example.demo.repository;

public interface OrderRepository {
    int getPrice(int price); // 1) 10000 ==> 9900 원  2) 10000 ==> 9000 원
}
