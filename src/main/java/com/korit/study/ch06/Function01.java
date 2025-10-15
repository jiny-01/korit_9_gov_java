package com.korit.study.ch06;

/*
* 함수란?
* 메소드란?
* 함수의 종류 중 클래스 내부에 정의되어 있는 함수
*
* */

public class Function01 {
    public static void main(String[] args) {
        int result = sum(10, 20, 30, 40);  //--1) 함수 호출   함수명(매개변수)
        System.out.println(result);
    }

    //당분간은 함수 정의 시 static 붙이기
    static int sum(int a, int b, int c, int d) {        //함수 매개변수
        return sum2(a, b) + sum2(c, d);
    }

    static int sum2(int a, int b) {
        return a + b;
    }



}
