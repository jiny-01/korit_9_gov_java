package com.korit.study.ch04;

import java.util.Scanner;

public class Controller06 {
    public static void main(String[] args) {
//        // 줄첩 반복
//        for (int i = 0; i < 5; i++) {
//            System.out.println("i = " + i);
//            for (int j = 0; j < i; j++) {
//                System.out.println("j = " + j);
//            }
//        }


        // 구구단
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작단를 입력하세요: ");
        int startDan = scanner.nextInt();
        System.out.print("끝단를 입력하세요: ");
        int endDan = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <= endDan - startDan + 1; i++) {
            int dan = startDan + 1;
            System.out.println("----" + dan + "단 ----");
            for (int j = 0; j < 10; j++) {
                int num = j + 1;
//                System.out.println(dan + "x" + num + "=" + (dan * num));
                System.out.printf("%d x %d = %d", dan, num, dan * num);
            }
        }


        //5단 -> 3단 까지 5*9 먼저 나오게
        int range = endDan - startDan + 1;
        for (int i = endDan; i >= startDan; i--) {
            int dan = startDan + 1;
            for (int j = 0; j < 10; j++) {
                int num = 9 - j;
                System.out.printf("%d x %d = %d", dan, num, dan * num);

            }
        }

    }
}
