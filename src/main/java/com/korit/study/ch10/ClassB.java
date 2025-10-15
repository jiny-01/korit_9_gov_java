package com.korit.study.ch10;

public class ClassB {
    String name;
    int age;

    //클래스 정의
    //ClassB 라는 이름의 생성자
    ClassB(String name, int age) {
        //클래스의 속성에 매개변수로 받은 name 대입
        //this : 자기자신의 주소
        //무조건 this 쓰는 것은 아님 - 여기선 변수명이 같기 때문
        this.name = name;
        this.age = age;

    }

}
