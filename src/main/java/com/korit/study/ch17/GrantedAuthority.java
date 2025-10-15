package com.korit.study.ch17;

public interface GrantedAuthority {
//사용자 계정에 권한을 줄 때

    String getAuthority();    //인터페이스만 public 기본이므로 생략 가능


}
