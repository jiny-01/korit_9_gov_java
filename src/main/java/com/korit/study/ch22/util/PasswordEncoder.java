package com.korit.study.ch22.util;

import java.util.Objects;

public class PasswordEncoder {

    private static final String secrete = "암호화비밀번호";

    public static String encode(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        long hash = Integer.toUnsignedLong(Objects.hash(str));
        long encodedHash = hash + Objects.hash(secrete);
        return Long.toHexString(encodedHash);
    }

    public static boolean match(String 평문, String 암호문) {
        // str : 평문  /  encodedStr : 암호문
        if (Objects.isNull(평문) || Objects.isNull(암호문)) {     //null safe 되도록 체크해주기
            return false;
        }
        return (encode(평문).equals(암호문));



    }

}
