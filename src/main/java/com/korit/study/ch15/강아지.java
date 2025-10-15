package com.korit.study.ch15;

public class 강아지 extends 동물{
    //강아지 생성자
    //NoArge 만들어놓기
    강아지() {};   //생성자 호출은 무조건 젤 먼저

    강아지(String 이름) {
        super(이름);
        System.out.println("강아지 생성자: " + 이름);
    }

    //super: 위로 /  extends: 생성자

}
