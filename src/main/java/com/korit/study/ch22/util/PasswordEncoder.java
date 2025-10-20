package com.korit.study.ch22.util;

import java.util.Objects;

public class PasswordEncoder {

    private static final String secrete = "암호화비밀번호";

    public static String encode(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        long hash = Integer.toUnsignedLong(Objects.hash(str));  //입력된 문자열의 해시 코드를 생성
        long encodedHash = hash + Objects.hash(secrete);  //문자열 해시 값 + '비밀 키'의 해시 값을
        return Long.toHexString(encodedHash);  //최종 값을 16진수 문자열로 변환
    }

    //사용자가 입력한 평문 비밀번호와 DB에 저장된 암호화된 비밀번호를 비교
    public static boolean match(String 평문, String 암호문) {
        // str : 평문  /  encodedStr : 암호문
        if (Objects.isNull(평문) || Objects.isNull(암호문)) {     //null safe 되도록 체크해주기
            return false;
        }
        return (encode(평문).equals(암호문));



    }

}
