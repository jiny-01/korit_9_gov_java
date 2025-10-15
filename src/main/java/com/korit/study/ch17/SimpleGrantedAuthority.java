package com.korit.study.ch17;

public class SimpleGrantedAuthority implements GrantedAuthority {
    private String role;

    public SimpleGrantedAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
