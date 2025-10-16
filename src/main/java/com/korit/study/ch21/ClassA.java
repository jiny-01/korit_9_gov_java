package com.korit.study.ch21;

public class ClassA {

    public void run() {
//        Singleton singleton = new Singleton("ClassA 데이터");
        Singleton.getInstance().changeData();  //Singleton 클래스 안에 static 변수인 singleton 을 호출해서 메서드 사용 가능
        Singleton.getInstance().deleteData();
    }
}
