package com.korit.study.ch21;

public class ClassC {

    public void run() {
//        Singleton singleton = new Singleton("ClassC 데이터");
        Singleton.getInstance().changeData();
        Singleton.getInstance().deleteData();

    }
}
