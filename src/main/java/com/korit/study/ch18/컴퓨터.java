package com.korit.study.ch18;

public class 컴퓨터 extends 전자기기 {
    //클래스는 인터페이스를 implements 하면 오버라이딩을 필수로 해줘야함


    public 컴퓨터(int 전압) {
        super(전압);
    }

    @Override
    public void 켠다() {
        System.out.println("컴퓨터 전원을 켭니다.");
    }

    @Override
    public void 끈다() {
        System.out.println("컴퓨터 전원을 끕니다.");
    }

    public void 바이오스부팅() {
        System.out.println("바이오스 세팅으로 들어갑니다.");
    }
}
