package com.korit.study.ch33;

public class ThreadMain {
    public static void main(String[] args) {

        //thread - runnable ???
        //공유 자원이 있을 때 락킹 필요 - 쓰고있음 wait 걸어줌
        //동기화 - 다음 쓰레드에 넘겨주는 것
        //동

        int sum = 0;
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("1번 반복문: " + i);
                sum += i;  //sum = sum + i
            }
        });



        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("2번 반복문: " + i);
                sum += i;
            }
        });
        System.out.println("쓰레드 시작!!!!");

        thread1.start();
        thread2.start();

        System.out.println("쓰레드 종료!!!!");








    }
}
