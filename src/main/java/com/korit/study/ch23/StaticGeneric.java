package com.korit.study.ch23;

public class StaticGeneric<T> {
    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <T extends String> void print(T data) {
        System.out.println(data);
    }
    //하한선 : String, 상한선 : Objcect

}
