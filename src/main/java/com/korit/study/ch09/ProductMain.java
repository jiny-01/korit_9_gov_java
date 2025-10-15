package com.korit.study.ch09;



public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "아이폰17";
        p1.price = 1200000;
        int p1DiscountPrice = p1.discount();
        System.out.println("상품명: " + p1.name);
        System.out.println("원가: " + p1.price);
        System.out.println("할인가: " + p1DiscountPrice);
        System.out.println("할인가: " + p1.discount());




    }
}
