package com.korit.study.ch16.dto;

import com.korit.study.ch16.entity.User;

public class SignupDto {
    private String username;
    private String password;
    private String name;


    public SignupDto(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    //getter & setter
    //회원가입 dto 는 todoListView 의 signupView 에서 생성할 때 값을 주입하고 그 값이 바뀔 일 없으므로 setter 불필요
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public String getName() {
        return name;
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
    public User toUser() {
        return new User(0, username, password, name);

    }
}
