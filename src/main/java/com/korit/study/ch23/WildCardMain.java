package com.korit.study.ch23;

import java.util.ArrayList;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class WildCardMain {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("김준일");
        names.add("김준이");
        names.add("김준삼");

//        printAll(names);  //불가능
        WildCardMain main = new WildCardMain();
//        main.printAll(names);     //printAll() 은 main 클래스에 있으므로 main.printAll 참조

        ArrayList<User> users = new ArrayList<>();               //users : User 객체를 담는 것
        users.add(new User("test1", "1234"));
        users.add(new User("test2", "5678"));
        users.add(new User("test3", "1111"));


    }

//    public void printAll(Object list) {
//        for (Object s : (ArrayList) list) {
//            System.out.println(s);
//        }
//    }
    //Object list 로 해버리면 String 이 담긴 names 를 담을 수 없음

    public void printAll(ArrayList<?> list) {
        list.get(0);
        for (Object s : list) {
            System.out.println(s);
        }
    }
}
