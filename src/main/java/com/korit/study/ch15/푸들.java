package com.korit.study.ch15;

public class 푸들 extends 강아지{
    //1. 푸들 생성자 호출
    public 푸들(String 이름) {
        super(이름);           //상위 객체 - 강아지
        System.out.println("푸들 생성자: " + 이름);
    }

    void 먹다() {
        System.out.println("먹다 오버라이드");

    }
}
