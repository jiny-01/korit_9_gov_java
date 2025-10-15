package com.korit.study.ch10;

public class ClassD {
    final String name;
    //상수는 사용 전 무조건 최초 1번 초기화
    // 생성자로 만들어질 때 초기값은 default 로 null 들어감 -> 나중에 바꿀 수 없음, 상수 지정하는 의미가 없음
    // => final 을 인스턴스에 주면 강제값을 주는 것 = 필수값
    // 생성 이후 변경되지 않아야할 값을 상수로 줘야함

    int age;
    String address;

    ClassD(String name) {
        this.name = name;
    }
}
