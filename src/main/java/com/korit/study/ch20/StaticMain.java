package com.korit.study.ch20;

import com.korit.study.ch01.Casting;
import com.korit.study.ch19.Car;

import java.util.Arrays;

public class StaticMain {
    public static void main(String[] args) {
        StaticStudy staticStudy = new StaticStudy();  //객체 생성 - 동적 메모리 할당
        staticStudy.print("김지니");
        StaticStudy.print("김지니");
        staticStudy.age = 10;  //인스턴스 변수
        System.out.println(staticStudy.age);    //10
        System.out.println(staticStudy.age2);   //0
        StaticStudy.age2 = 20;
        System.out.println(StaticStudy.age2);   //20
        staticStudy.age2 = 30;
        System.out.println(StaticStudy.age2);   //30 - static 변수는 공유되기 때문

        StaticStudy s2 = new StaticStudy();
        s2.age2 = 50;
        System.out.println(staticStudy.age2);  //50
        //아무리 새로 생성해도 static 은 정적 메모리이므로 프로그램 종료 시까지 공유됨, 생성할 필요 없음

        //원래는 생성을 해야 객체 내 메서드 사용가능하지만 static 은 바로 클래스. 으로 메서드 호출 가능
//        Casting.main(null);



    }
}
