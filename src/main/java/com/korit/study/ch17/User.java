package com.korit.study.ch17;

import java.util.Arrays;

public class User {

    private String username;
    private String password;
    private String[] roles;

    public User(String username, String password, String[] roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    //getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String[] getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }
}
