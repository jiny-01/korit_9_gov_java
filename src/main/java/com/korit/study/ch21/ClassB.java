package com.korit.study.ch21;

public class ClassB {

    public void run() {
//        Singleton singleton = new Singleton("ClassB 데이터");
        Singleton.getInstance().changeData();
        Singleton.getInstance().deleteData();

    }
}
