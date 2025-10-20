package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SigninDto;

//로그인 서비스가 반드시 구현해야 할 기능 => 인터페이스
public interface SigninService {
    void signin(SigninDto signinDto);  //로그인 로직
    boolean isEmpty(String str);  //입력값 비었는지 확인

}
