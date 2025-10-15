package com.korit.study.ch04;

public class Controller04 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; ++i) {
//            System.out.println(i);
//        }
//        // i = 0 -> i < 5 -> sout -> ++i 순서
//
////        int i = 0;
//
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

        //for 문과 while 문 각각 지역이므로 i 쓸 수 있음

        // 2~ 100 사이 수 중 4의 배수 값
//        for (int i = 2; i < 100; i++) {
//            if (i % 4 == 0) {
//                System.out.println(i);
//            }
//        }

        //i 를 20 번 반복, 0부터 시작, i = 홀수 / i = 짝수
        //출력결과는 1부터 나와야함
        for (int i = 0; i < 20; ++i) {
            int num = i + 1;
            if (num % 2 == 1) {
                System.out.println(num + " -홀수");
            } else if (num % 2 == 0) {
                System.out.println(num + "-짝수");
            }
        }

        for (int i = 0; i < 20; i++) {
            int n = i + 1;
            System.out.printf("%,d = %s\n", n, n % 2 == 0 ? "짝" : "홀");
            if (n % 2 == 0) {
                System.out.println(n + " = 짝");
            } else {
                System.out.println(n + " = 홀");
            }

            if (n % 2 == 0) {
                System.out.println(n + " = 짝");
                continue;                            //continue 쓰는 순간 밑에 코드는 실행되지 않음
            }
            System.out.println(n + " = 홀");


        }
    }
}
