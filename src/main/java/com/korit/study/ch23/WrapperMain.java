package com.korit.study.ch23;

import java.util.ArrayList;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = num;  //autoBoxing
//        Integer num3 = new Integer(10);  //Boxing : 일반자료형을 wrapper 클래스에 넣는 것
        int num4 = num2; //autoUnBoxing
//        String numStr = num2;  //바로 .toString() 불가능 - 값이므로
        String numStr = Integer.toString(num);
        String numStr2 = "" + num;
        String numStr3 = num2.toString();  //wrapping 되어있을 경우 바로 toString() 가능

        //모든 참조자료형은 Object 를 상속받음
        //일반 자료형 -> 참조자료형  Boxing
        //제네릭 타입은 무조건 참조자료형만 지정가능

        //다시 int 로 변환 -> unBoxing

        short s1 = 10;
        Short s2 = s1;

        byte b1 = 10;
        Byte b2 = b1;

        long l = 1000000000000L;
        Long l2 = l;

        double d = 0.0;
        Double d2 = d;

        float f = 3.14f;
        Float f2 = f;

        char c = 'A';
        Character c2 = c;

//        boolean b = true;
//        Boolean bb = b;







    }
}
