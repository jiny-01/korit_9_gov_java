package com.korit.study.ch21;

import java.util.Objects;

public class Singleton {
    private volatile static Singleton instance = new Singleton("Class Data");
    // static 으로 만들어진 singleton 객체를 서로 다른 여러 곳에서 공유해서 사용
    //*싱글톤 => 오직 하나의 인스턴스만 가짐, 무조건 하나의 객체를 공유해서 사용할 때 (외부에서 다시 생성되면 안됨)
    //그래서 싱글톤 생성자의 생성 자체를 막기 위해 생성자의 접근 지정자를 private 로
    // 싱글톤 객체의 변수명은 항상 instance 로 통일
    //외부에서 호출하기 위해 getter 사용
    //volatile : 휘발되지 않는 메모리

    private String data;

    //생성자 호출을 막아서 다른 객체에서 생성안되도록
    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton("CLass Data");
        }
        return instance;
    }
    //null 인지 확인해서 null, 즉 최초의 한번만 생성하도록

    //이게 완전한 싱글톤 - 동시성까지 해결한 것
    public static Singleton getSynchronizedInstance() {
        if (Objects.isNull(instance)) {          //작업 중인지 최초 확인
            synchronized (Singleton.class) {     //다른 곳에서 작업 중인지 확인 - O : 건너뜀 X : 재검사
                if (Objects.isNull(instance)) {    //진짜 작업 중 아닌 게 확인되면 그때서야 생성하는 것
                    instance = new Singleton("Class Data");
                }
                return instance;
            }
        }
    }

    public void changeData() {
        System.out.println("데이터 변경: " + data);
    }

    public void deleteData() {
        System.out.println("데이터 삭제: " + data);
    }
}
