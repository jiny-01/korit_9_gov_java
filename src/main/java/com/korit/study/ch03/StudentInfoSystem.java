package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //변수는 되도록 위에서 초기화하는 것이 좋음
        String name = "";
        int age = 0;
        int grade = 0;
        double korea = 0;
        double eng = 0;
        double math = 0;
        String info = "";

        System.out.print("학생 이름을 입력하세요.: ");
        name = scanner.next();
        System.out.print("나이를 입력하세요: ");
        age = scanner.nextInt();
        System.out.print("학년을 입력하세요: ");
        grade = scanner.nextInt();
        System.out.print("국어 점수를 입력하세요: ");
        korea = scanner.nextDouble();
        System.out.print("영어 점수를 입력하세요: ");
        eng = scanner.nextDouble();
        System.out.print("수학 점수를 입력하세요: ");
        math = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("자기 소개를 입력하세요: ");
        info = scanner.nextLine();

        System.out.println("===학생 정보===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.print("성적: ");
        System.out.println("국어: " + korea);
        System.out.println("영어: " + eng);
        System.out.println("수학: " + math);
        double avg = (korea + eng + math) / 3;
        String scoreGrade = (avg >= 95) ? "A+" :
                (avg >= 90) ? "A" :
                        (avg >=85) ? "B+" :
                                (avg >= 80) ? "B" :
                                        (avg >= 75) ? "C+" :
                                                (avg >= 70) ? "C" :
                                                        (avg >= 65) ? "D+" :
                                                            (avg >= 60) ? "D" : "";

        System.out.println("평균: " + avg + "(학점 : " + scoreGrade +")");
        System.out.println("자기소개: " + info);

        System.out.println("===학생 정보===");
        System.out.println(String.format("""
                이름: %s
                나이: %d세 (고등학교 2학년)
                성적:
                  국어: %.2f점
                  영어: %.2f점
                  수학: %.2f점
                  평균: %.2f점 (학점: %s)
                자기소개: %s,
                """, name, age, korea, eng, math, avg, scoreGrade, info));





    }
}
