package com.korit.study.ch06;

import java.util.Date;

public class Practice01 {
    public static void main(String[] args) {
        fx();
        hello("김지니");
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getHours());
        System.out.println(now.getMinutes());
        System.out.println(cal(5));

    }

    // 매개변수 없음, 리턴값 없음
    // "안녕하세요!"를 출력하는 함수를 작성하세요
    public static void fx() {
        System.out.println("안녕하세요!");
    }


    // 매개변수 있음, 리턴값 없음
    // 이름을 받아서 "안녕하세요, [이름]님!"을 출력하는 함수를 작성하세요
    public static void hello(String name) {

        System.out.println("안녕하세요, " + name + "님");
    }

    // 매개변수 있음, 리턴값 있음
    // 정수를 받아서 제곱값을 반환하는 함수를 작성하세요
    public static int cal(int n) {
        return n * n;
    }

    // 매개변수 없음, 리턴값 있음
    // 현재 시간을 "현재 시간입니다"라는 문자열로 반환하는 함수를 작성하세요
    public static String isNowTime(int hours, int minutes) {
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();
//        long now = new Date().getTime();
//        Date date = new Date();
//        System.out.println("현재 시간입니다- " + date.toString());
        return hours == nowHours && minutes == nowMinutes ? "현재 시간입니다." : "현재 시간이 아닙니다.";

    }

}
