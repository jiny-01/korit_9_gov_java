package com.korit.study.ch22.dto;

public class SigninDto {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //SignupMain (입력) → SigninDto (데이터 담기) → SigninService가 signinDto의 getUsername()과 getPassword()를 직접 사용 → UserRepository에서 조회 및 PasswordEncoder로 비교
}
