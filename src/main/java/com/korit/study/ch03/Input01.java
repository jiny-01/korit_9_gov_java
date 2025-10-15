package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
//        일반 자료형 & 참조 자료형
//        String- 참조자료형
        Scanner s = new Scanner(inputStream);
//        String str = s.next();
//        System.out.println("입력값: " + str);
//
        String address = s.next();
        //엔터 눌려지는 순간 입력값을 address 에 저장하는 것
        System.out.println("주소: " + address + s.next());

        String adr = s.nextLine();
        System.out.println("주소: " + adr);
        s.next();  //버퍼에 남아있는 엔터 1번 버림
        System.out.println(s.next());

        // s.next() : 띄어쓰기(엔터 누를 때까지의 입력값) 전까지만 출력
        // 스페이스바 입력이 먼저 나오면 무시
        // 버퍼에는 띄어쓰기 포함해서 저장되어있음
        // s.nextLine() : 띄어쓰기 포함이므로 엔터까지 입력해야 입력이 끝남
        // => 문자열을 입력받을 땐 nextLine 이 적절함

    }
}
