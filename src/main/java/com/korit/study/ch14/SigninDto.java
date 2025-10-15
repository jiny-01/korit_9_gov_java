package com.korit.study.ch14;

public class SigninDto {
    String username;
    String password;


    public SigninDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // 안에 들어있는 값 확인하기 위한 단순 기능하는 함수
    @Override
    public String toString() {
        return "SigninDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
