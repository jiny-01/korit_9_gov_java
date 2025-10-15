package com.korit.study.ch10;

public class ClassEMain {
    public static void main(String[] args) {
        ClassE classE = new ClassE("김준일", 32, "동래구");

        System.out.println("name: " + classE.name);
        System.out.println(classE.toNameString());


    }
}
