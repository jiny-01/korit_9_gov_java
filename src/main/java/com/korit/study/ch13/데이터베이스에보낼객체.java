package com.korit.study.ch13;

public class 데이터베이스에보낼객체 {
    String username;
    String password;
    String name;
    String email;

    데이터베이스에보낼객체(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    //기본적으로 NoArgu 가 있으므로 덮어써버림 -> 생성자로 쓰고 싶다면 오버로딩으로 빈 깡통 만들기
    데이터베이스에보낼객체(){}



}
