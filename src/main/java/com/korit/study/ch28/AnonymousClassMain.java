package com.korit.study.ch28;

import java.util.concurrent.atomic.AtomicInteger;

//익명 클래스 : 한 번 이 기능을 사용하고 끝낼 경우 - 사용하고 나면 소멸? 일회용
//추상적 성격 있으면 anonymous 가능 ex) 추상클래스

public class AnonymousClassMain {
    public static void main(String[] args) {
        AnonymousClass a = new AnonymousClassImpl();
        a.fx1();
        System.out.println(a.fx2());

        int num = 10;        //지역변수로 선언한 num 변수
        AtomicInteger num2 = new AtomicInteger(10);

        //*원래는 클래스처럼 인터페이스를 생성하진 못함
        AnonymousClass b = new AnonymousClass() {
            @Override
            public void fx1() {
                System.out.println(num);    //여기 가져다 쓸 수 있음
                //원래라면 클래스 상단에 변수를 선언하거나, 매개변수로 받아와야함
//                num += 10;   //intellij 에서 막음
                num2.set(num2.get() + 10);
                //anonymous 쓰면서 생길 수 있는 문제
                //여기서 호출을 해서 set 을 했으므로 다른 쓰레드에선 호출 못함 - wait 걸려있음 - 락킹

            }

            @Override
            public int fx2() {
                return 0;
            }






        };
    }

}
