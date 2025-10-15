package com.korit.study.ch06;

import java.security.spec.RSAOtherPrimeInfo;

/*
* 함수: 특정 작업을 수행하는 코드의 집합
* 입력값(매개변수)을 받아 처리한 후 결과값(리턴값)을 반환할 수 있음
*
* 자바에서 함수의 필요성
* 코드의 재사용성 향상
* 프로그램의 구조화와 모듈화
* 코드의 가독성 및 유지보수 용이
* 복잡한 문제를 작은 단위로 분해
*
*
* publilc static 리턴타입 함수명(매개변수) {
*     실행할 코드
*   return 결과값
* }
*
* 접근제한자: public, private, protected
* static 키워드- 객체 생성없이 호출 가능
* 리턴 타입: void(반환값 없음)
* */

public class Function02 {
    public static void main(String[] args) {
        fx1();
        fx2("김준일", 32);
        fx2("김준이", 33);
        fx3("김준삼", 34);

//        int[] arr1 = fx4();    //1~10 까지의 배열
//        printIntArray(arr1);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }


//        int[] arr2 = fx5(5);
//        printIntArray(arr2);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }


    }

    //void: 리턴값이 없는 함수
    static void fx1() {
        int num1 = 10;
        int num2 = 20;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += num1;
            result += num2;
        }
        System.out.println(result);
    }

    static void fx2(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    static void fx3(String a, int b) {
        System.out.println("이름: " + a);
        System.out.println("나이: " + b);
    }

    static int[] fx4() {
        int[] result = new int[0];   //result : 빈 배열
        int size = 10;
        for (int i = 0; i < size; i++) {
            int[] temp = new int[result.length + 1];  //반복할 때마다 기존 배열의 길이보다 1 큰 temp 배열
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j];
            }
            temp[temp.length - 1] = i + 1;  //temp 의 마지막 자리에 i+1 넣기
            result = temp;

        }
        return result;
    }


    static int[] fx5(int size) {
        int[] result = new int[0];   //result : 빈 배열
        for (int i = 0; i < size; i++) {
            int[] temp = new int[result.length + 1];  //반복할 때마다 기존 배열의 길이보다 1 큰 temp 배열
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j];
            }
            temp[temp.length - 1] = i + 1;  //temp 의 마지막 자리에 i+1 넣기
            result = temp;

        }
        return result;
    }

    static void printIntArray() {
        System.out.println();
    }








































}
