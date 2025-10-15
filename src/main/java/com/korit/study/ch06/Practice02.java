package com.korit.study.ch06;

public class Practice02 {
    public static void main(String[] args) {
        add(2, 3);
        add(0.1, 0.2);
        add(1, 2, 3);
        printInfo("김지니");
        printInfo("김지니", 25);
        printInfo("김지니", 25, "부경대");

    }

    // 정수 2개를 더하는 함수
    public static int add(int a, int b) {
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(double a, double b) {
        return (int)(a + b);
        // a=1.1, b=2.2 일 때 double 이면 3.3 나오지만
        //오버로딩이므로 int 로 리턴
        //리턴 타입은 같아도, 달라도 상관없음
    }

    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    //리턴 타입 달라도 가능
//    public static double add(int a, int b, int c) {
//        return a + b + c;
//    }


    // 이름만 출력하는 함수
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

// 이름과 나이를 출력하는 함수를 오버로딩으로 작성하세요
// 이름, 나이, 학교를 출력하는 함수도 오버로딩으로 작성하세요

    public static void printInfo(String name, int age) {
        printInfo(name);
        System.out.println("나이: " + age);
    }

    public static void printInfo(String name, int age, String school) {
        printInfo(name, age);
        System.out.println("학교: " + school);
    }


}
