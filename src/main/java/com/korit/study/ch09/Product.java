package com.korit.study.ch09;

public class Product {
    String name;
    int price;

    int discount() {
        return (int)(price - (price * 0.2));   //기존가의 20프로 할인가

    }
}
