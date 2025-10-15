package com.korit.study.ch01;

//파일 최상단에 /***/ 주석 사용하면 해당 코드 파일에 대한 정보 (버전관리, 저자,,,)

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 *
 * */
public class Type {
    public static void main(String[] args) {
//=========================논리 자료형=======================================

        //boolean : 1 bit 의 메모리 공간 할당
        boolean open = true;
        open = true;                //최초의 대입 = 초기화 = 최초의 값 대입
        System.out.println(open);
        open = false;
        System.out.println(open);

//=========================문자 자료형=======================================
        char lastName = '김';
        System.out.println(lastName);
//        char firstName = '준일';

//=========================문자열 자료형=======================================
        String firstName = "준일";         //String - 클래스명
        System.out.println(firstName);

        String contents1 = "안녕하세요.\n김준일입니다.";
        System.out.println(contents1);
        String contents2 = """
                안녕하세요.
                김준일입니다.
                """;
        System.out.println(contents2);

//=========================숫자 자료형=======================================
        double avg = 89.33;
        System.out.println(avg);
        int number = 10000000;
        System.out.println(number);
        long nowTime = (int) new Date().getTime();     //long -> int (명시적 형변환)
        System.out.println(nowTime);

        long longNumber = 2200000000l;
        System.out.println(longNumber);

//=========================상수=================================================
//        상수 - 대문자, 선언은 최초 1번, 협업 시 제약 목적
//        데이터가 변하지 않게 제약을 걸기 위한 목적
        final String uploadPath = "~/upload/image";
        final String UPLOAD_PATH = "~/upload/image";   //상수는 선언 시 초기화
//        UPLOAD_PATH =         재선언 불가
















    }
}
