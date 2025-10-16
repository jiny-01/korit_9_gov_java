package com.korit.study.ch19;

import java.util.Scanner;

public class 최상위클래스 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        Object c = a;
        Object d = b;
        Object e = "test";
        String f = "abc";
        Car car = new Car("k3", "화이트");
        Car car2 = new Car("k3", "화이트");
        Object g = car;
//        System.out.println(car.toString()); //비활성화 - 사용안하고 있거나 생략 가능
        String h = car.toString();
        System.out.println(car);

//        System.out.println(c + d);
        //Object 로 업캐스팅되었으므로 기능 상실

        String name1 = "김준일";
        String name2 = "김준일";
        boolean result1 = name1 == name2;
        System.out.println(result1);
        String name3 = new String("김준일");
        System.out.println(name3 + " 입니다.");

        Scanner scanner = new Scanner(System.in);
        String name4 = scanner.nextLine();
        System.out.println(name4);

//        boolean result2 = name1 == name3;
        boolean result2 = name1.equals(name3);
        System.out.println(result2);
        boolean result3 = name2 == name4;
        System.out.println(result3);

        // == : 주소값 비교
        // .equals : 자료형, 값까지 비교하는 것     => 문자열 비교 시 무조건 equals 써라
        // -> Object 에 오버라이드 되어있음
        // ex) String.equals(car)
        // 이면 String 과 car 의 자료형은 Car이므로 자료형이 달라서 false






    }

}
