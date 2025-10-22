package com.korit.study.ch23;

import java.util.ArrayList;

public class CollectionMain {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("20");
        list.add(30.5);
        list.add(true);
//        list.add(앗.. 들켰다);
        System.out.println(list);
//        System.out.println(list[0]);  //원래 배열은 이렇게 추축
        System.out.println(list.get(0));   //-> Object 타입의 10
        ArrayList<String> strList = new ArrayList<>();
        strList.add("문자열");
        System.out.println(strList.get(0));
        //제네릭 ->> 결국 추상화 개념 포함 - 유연성 가짐

        test(new ArrayList<>());   //여기서 ArrayList 는 String 타입
    }

    public static void test(ArrayList<String> strList) {

    }

}
