package com.korit.study.ch22.dto;

import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.util.PasswordEncoder;

public class SignupDto {
    private String username;
    private String password;
    private String confirmPassword;


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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    //toUser : dto -> User 객체 변환
    public User toUser() {
        return new User(0, username, PasswordEncoder.encode(password));
    }
}
