package com.korit.study.ch13;

public class MapperPatternMain {
    public static void main(String[] args) {

        // Mapper Pattern
        // 서로 매핑시켜서 객체를 변환시키는 것 ex) toEntity

         클라이언트에서받은객체 a = new 클라이언트에서받은객체();
         a.username = "test1234";
         a.password = "1q2w3e4r";
         a.fullName = "김준일";
         a.email = "test@gmail.com";

//         데이터베이스에보낼객체 b = new 데이터베이스에보낼객체();
//         b.username = a.username;
//         b.password = a.password;
//         b.name = a.fullName;
//         b.email = a.email;

         데이터베이스에보낼객체 c = a.to();
         System.out.println(c);









    }
}
