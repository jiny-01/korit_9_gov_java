package com.korit.study.ch27;

public class InnerClassMain {
    public static void main(String[] args) {
        User user = new User("test1", "1234");
        System.out.println(user);

        // 비정적(inner) 클래스는 바깥 클래스 인스턴스를 통해서 생성해야 함
        User.UserPrinter userPrinter = user.new UserPrinter(user.toString());

        userPrinter.print(); // 출력: User{username='test1', password='1234'}

        User.UserPrinter2 userPrinter2 = new User.UserPrinter2(user.toString());
        //UserPrinter2 를 static 으로 해줬기 때문에 new User.UserPrinter2() 로 가능
        userPrinter2.print();
    }
}
