package com.korit.study.ch09;

public class Product {
    String name;
    int price;

    int discout() {
        return (int) (price - (price * 0.2));

    }
}
