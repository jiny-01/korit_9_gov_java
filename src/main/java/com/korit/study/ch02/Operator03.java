package com.korit.study.ch02;

public class Operator03 {
    public static void main(String[] args) {
//        논리 연산자
//        || or 연산자 (합)  - false(0) true(1) => 전기회로와 같음, 하나라도 true 면 true
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = b1 || b2;
        System.out.println(b3);
        b3 = b1 || true;
        System.out.println(b3);

//        && and 연산자 (곱) => 2개 조건 모두 만족해야 true, 즉 모두 true 일 때 true
        boolean b4 = b1 && b2;
        b4 = b1 && true;
        b4 = true && true;

//        ! not 연산자 (부정)
        boolean b5 = b1 && true;
        b5 = !b5;
        System.out.println(b5);
        System.out.println(!(true && true));


    }
}
