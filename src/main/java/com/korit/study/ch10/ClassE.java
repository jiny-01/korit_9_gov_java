package com.korit.study.ch10;

public class ClassE {
    String name;
    int age;
    String address;

    public ClassE(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    String toNameString() {
        return "name = " + name + "age = " + age + "address = " + address;
    }
}
