package com.korit.study.ch02;

public class Operator01 {
    public static void main(String[] args) {
//        산술 연산
          int n1 = 10;
          int n2 = 5;
          int r1 = n1 + n2;
          System.out.println(r1);
//        문자열 더하기
          String text1 = "문자열";
          String text2 = "합치기";
          String text3 = text1 + text2;
          System.out.println(text3);
        System.out.println("문자열2" + "    " + "합치기2" + text1 + ":  " + r1);  //문자열엔 어떤 걸 + 해도 문자열로 업캐스팅
        //=> 산술 연산이 일어나면, 무조건 상위 자료형으로 업캐스팅됨

//        연산으로 인한 캐스팅
          double n3 = 2.1;
          int n4 = 10;
          System.out.println(n3 + n4);
          String n5 = "" + 2.1;
          double n6 = 10.12;
          double n7 = Double.parseDouble(n5) + n6;
          System.out.println(n7);
          System.out.println((char)('a' + 10));    //=>k, char 가 int 보다 하위이므로 상위인 int 따라감
          System.out.println('a' + 'b');           // + : 문자열이 아닐 땐 연산  -> 아스키코드에 의해 97 + 98 과 같음
          System.out.println("" + 'a' + 'b');       //앞에서부터 순서대로, => 문자열 더하기가 되므로 => ab 출력됨

//        나머지 연산
          int n8 = 10;
          int n9 = 4;
          int n10 = n8 % n9;
          System.out.println(n10);









    }
}
