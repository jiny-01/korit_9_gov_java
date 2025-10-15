package com.korit.study.ch17;

public interface UserDetails {

    //public abstract 가 다 생략된 것
    String getUsername();
    String getPassword();
    GrantedAuthority[] getAuthorities();


}
