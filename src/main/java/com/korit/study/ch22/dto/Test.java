package com.korit.study.ch22.dto;

class Entity {
    private String name;

    public void call() {
        Entity t = new Entity();
        t.name = "김준일";
        System.out.println(t.name);
    }

    public void thisCall() {
        System.out.println(name);
    }

}



public class Test {
    public static void main(String[] args) {
        Entity e = new Entity();
        e.call();
        e.thisCall();
    }

    //Test 와 Entity 다른 클래스이므로 e.name 불가능


}
// private
// 주소가 다르다고 해서 접근 불가능한 것이 아닌 동일 클래스 (파일) 면 접근 가능
// 주소와 상관없이 파일 간 관계, 즉 클래스?


