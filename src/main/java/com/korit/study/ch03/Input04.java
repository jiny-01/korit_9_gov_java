package com.korit.study.ch03;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = "김준일".charAt(0);   //-> "김" 한 글자만 뽑아냄
        System.out.println(a);
        char b = scanner.next().charAt(0);
        System.out.println(b);
    }
}
