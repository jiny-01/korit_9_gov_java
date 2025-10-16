package com.korit.study.ch20;

public class FactoryMain {
    public static void main(String[] args) {
        Factory f1 = new Factory("1공장");
        Factory f2 = new Factory("2공장");
        Factory f3 = new Factory("3공장");

        Product p1 = f1.createProduct("상품1");
        Product p2 = f1.createProduct("상품2");
        Product p3 = f1.createProduct("상품3");
        Product p4 = f1.createProduct("상품4");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


    }
}
