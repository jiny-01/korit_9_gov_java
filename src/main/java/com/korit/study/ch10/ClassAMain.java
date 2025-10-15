package com.korit.study.ch10;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();   //classA : 함수이자 생성자
        a.name = "김준일";
        a.age = 32;

        ClassB b = new ClassB("김준이", 33);
        System.out.println(b.name);

        ClassC c = new ClassC("김준삼", 33, "동래구");  //데이터 주입
        System.out.println(c.name);

        ClassC c2 = new ClassC();







    }
}
