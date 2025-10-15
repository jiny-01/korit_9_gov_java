package com.korit.study.ch09;

class Student {
        String name;
        int age;
        boolean gender;
        //함수 정의
        void printInfo() {
            System.out.println("학생 정보 출력");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age);
            System.out.println("성별: " + (gender ? "남" : "여"));
        }
        }

public class StudentMain {
    public StudentMain() {
    }

    public static void main(String[] args) {
        String name1 = "김준일";
        int age1 = 32;
        boolean gender1 = true;

        String name2 = "김준이";
        int age2 = 33;
        boolean gender2 = false;

        Student s1 = new Student();
        s1.name = "김준일";
        s1.age = 32;
        s1.gender = true;

        Student s2 = new Student();
        s2.name = "김준이";
        s2.age = 33;
        s2.gender = false;

        System.out.printf("""
                이름: %s
                나이: %d
                성별: %b
                """, name1, age1, gender1);

        System.out.printf("""              
                이름: %s
                나이: %d
                성별: %b
                """, name2, age2, gender2);

        System.out.println("이름:" + s1.name);
        System.out.println("이름:" + s2.name);

        s1.printInfo();
        s2.printInfo();
        //printInfo() 2개 서로 다른 것, 독립적

        // 2명의 학생정보를 객체를 사용하여 정의하고 출력하는 프로그램을 작성하시오.
    /*
       이름: 김준일
       나이: 32
       성별: 남(true)

       이름: 김준이
       나이: 32
       성별: 여(false)
    * */


    }
}
