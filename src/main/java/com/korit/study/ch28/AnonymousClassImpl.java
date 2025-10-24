package com.korit.study.ch28;

public class AnonymousClassImpl implements AnonymousClass{
    @Override
    public void fx1() {
        System.out.println("fx1 호출");
    }

    @Override
    public int fx2() {
        return 10;
    }
}
