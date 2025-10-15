package com.korit.study.ch10;

public class ClassC {
    String name;
    int age;
    String address;

    //기본 생성자
    ClassC() {

    }

    ClassC(String name) {
        this.name = name;
    }


    ClassC(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //생성될 때 이름, 나이 받도록
    ClassC(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }




}
