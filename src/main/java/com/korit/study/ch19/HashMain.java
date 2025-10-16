package com.korit.study.ch19;

import java.util.Objects;

public class HashMain {

    //hash (해시)란 Key, Value 의 한 쌍을 통해 데이터를 표현하는 기법
    // Key : 중복 불가능 (예: 주민등록번호)
    // Value : 중복 가능 (예 : 이름)


    public static void main(String[] args) {
        String name1 = "김준일";
        String name2 = new String("김준일");
        int age1 = 10;
        int age2 = 10;

        int hashKey1 = Objects.hash(name1);
        int hashKey2= Objects.hash(name2);
        int hashKey3 = Objects.hash(age1);
        int hashKey4 = Objects.hash(age2);

        System.out.println(hashKey1);
        System.out.println(hashKey2);
        System.out.println(hashKey3);
        System.out.println(hashKey4);

    }
}
