package com.korit.study.ch08;

import java.util.Random;
import java.util.Scanner;

// 배열 복습
public class Array01 {
    public static void main(String[] args) {
        // 묶어 놓고 반복울 통해 순서대로 데이터를 사용하려고
        // 배열: 동일한 타입의 여러 변수를 하나의 묶음으로 다루는 자료구조
        // 생성 시 고정된 크기, 인덱스로 각 요소에 접근
        // 무조건 연속된 메모리 공간 - 크기 고정된 이유
        //배열을 늘림 X -> 새로운 배열을 만들어서 이동시킴
        // -> 다중 값 저장, 연속된 메모리 공간, 인덱스로 접근(변수는 하나만 필요)

        //배열: 참조 타입, 실제 데이터는 힙 메모리에 저장
        //배열 변수는 배열 객체의 참조(주소)만 가진다
        //배열 크기는 생성 시점에 결정, 이후 변경 불가능
        //초기화하지 않은 요소는 타입별 기본값으로 채워짐
        int[] array = new int[] {10, 20, 30};


        // [] 배열 : 공간의 주소 대입 (아직 값이 들어있는 건 아님)
        // -> 단일 값 저장, 독립적 메모리 할당, 개별 이름 필요
        int[] a = new int[3];
        double[] b = new double[3];
        boolean[] c = new boolean[3];
        String[] d = new String[3];
        Scanner[] e = new Scanner[3];
        Random[] f = new Random[3];

        // 일반 : 값의 주소 대입
        int a2 = 10;
        double b2 = 10.5;
        boolean c2 = true;
        String d2 = "";
        Scanner e2 = new Scanner(System.in);
        Random f2 = new Random();

        System.out.println(f[0]);   // Random 배열 기본값 : null
        System.out.println(c[0]);   // boolean 배열 기본값 : false


    }
}
