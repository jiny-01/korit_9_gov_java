package com.korit.study.ch03;

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        //스캐너 불러오기
        Scanner scanner = new Scanner(System.in);

        System.out.println("1번 주소와 2번 주소를 입력하세요: ");
        String address1 = scanner.next();
        String address2 = scanner.next();
        System.out.println("주소1: " + address1);
        System.out.println("주소2: " + address2);
        System.out.println("num1 과 num2 숫자를 입력하세요. :");
        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());
        System.out.println("num1 + num2 = " + (num1 + num2));
        int num3 = scanner.nextInt();     //숫자만 입력해도 엔터는 남아있음
        int num4 = scanner.nextInt();
        System.out.println("num3 + num4 = " + (num3+ num4));
        scanner.nextLine();  //엔터 버리기용
        String addressAll = scanner.nextLine();
        System.out.println("현재 주소: " + addressAll);




    }
}
