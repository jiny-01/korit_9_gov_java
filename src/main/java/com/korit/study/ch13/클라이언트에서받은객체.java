package com.korit.study.ch13;

public class 클라이언트에서받은객체 {
    String username;
    String password;
    String fullName;
    String email;

    데이터베이스에보낼객체 to() {
        데이터베이스에보낼객체 a = new 데이터베이스에보낼객체();
        a.username = username;
        a.password = password;
        a.name = fullName;
        a.email = email;
        return a;
    }

    //AllArguConstructor
    데이터베이스에보낼객체 to2() {
        return new 데이터베이스에보낼객체(username, password, fullName, email);
    }


}
