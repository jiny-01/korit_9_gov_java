package com.korit.study.ch14;

public class SignupDto {
    String username;
    String password;
    String name;


    public SignupDto(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }


    @Override
    public String toString() {
        return "SignupDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    //새로운 유저 객체 생성해서 리턴 - signupDto 객체 안에 들어있는 값
    User toUser() {
        return new User(0, username, password, name);

    }
}
