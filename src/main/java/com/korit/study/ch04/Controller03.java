package com.korit.study.ch04;

import java.util.Scanner;

public class Controller03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOpen = true;

        //while 반복문은 조건에 의함
        //for 문은 순서가 중요함
        while(isOpen) {
            System.out.println("문을 닫으시겠습니까? (y/n)");
            String cmd = scanner.nextLine();
            isOpen = !"y".equals(cmd);
        }
        System.out.println("문을 닫고 나왔습니다.");


        while(true) {
            System.out.println("문을 닫으시겠습니까? (y/n)");
            String cmd = scanner.nextLine();
            if ("y".equals(cmd)) {
                break;
            }
            System.out.println("2222");
        }

        while (true) {
            System.out.println("첫번째 반복 y/n: ");
            String cmd = scanner.nextLine();
            if ("y".equals(cmd)) {
                while (true) {
                    System.out.println("두번째 반복 y/n: ");
                    String cmd2 = scanner.nextLine();
                    if ("n".equals(cmd2)) {
                        break;
                    }
                }
            } else {
                System.out.println("종료");
                break;
            }
        }


    }
}
