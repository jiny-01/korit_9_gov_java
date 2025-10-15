package com.korit.study.ch04;

public class Controller05 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(i + 1);
        }

        //for 안의 조건문을 바꾸기보단 반복 분기 안에서 바꾸는 것이 좋음
        // 순서, 횟수가 중요

        for (int i = 0; i < 5; i++) {
            System.out.println(5 - i);
        }



    }
}
