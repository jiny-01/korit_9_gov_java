package com.korit.study.ch23;

import java.util.ArrayList;

//기본 User 클래스: 사용자 계정 정보를 담는 단순한 DTO 역할
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

// User를 상속받은 VipUser (하위 타입)
class VipUser extends User {
    public VipUser(String username, String password) {
        super(username, password);
    }
}

// User를 상속받은 GoldUser (하위 타입)
class GoldUser extends User {
    public GoldUser(String username, String password) {
        super(username, password);
    }
}

public class WildCardMain {
    public static void main(String[] args) {
        WildCardMain main = new WildCardMain();
//        ArrayList<String> names = new ArrayList<>();
//        names.add("김준일");
//        names.add("김준이");
//        names.add("김준삼");

//        printAll(names);  //불가능

//        main.printAll(names);     //printAll() 은 main 클래스에 있으므로 main.printAll 참조

        // 1) User 객체 리스트 생성 및 데이터 추가
        ArrayList<User> users = new ArrayList<>();               //users : User 객체를 담는 것
        users.add(new User("test1", "1234"));
        users.add(new User("test2", "5678"));
        users.add(new User("test3", "1111"));
        main.printAll(users);

        // 2) VipUser 리스트 생성 (User를 상속한 하위 타입)
        //User 를 상속받은 vipUser, GoldUser 사용 가능
        ArrayList<VipUser> vipUsers = new ArrayList<>();
        vipUsers.add(new VipUser("vip1", "1234"));
        vipUsers.add(new VipUser("vip2", "5678"));
        vipUsers.add(new VipUser("vip3", "1111"));
        main.printAll(vipUsers);

        // 3) GoldUser 리스트 생성 (User의 또 다른 하위 타입)
        ArrayList<GoldUser> goldUsers = new ArrayList<>();
        goldUsers.add(new GoldUser("gold1", "5678"));
        goldUsers.add(new GoldUser("gold2", "1234"));
        goldUsers.add(new GoldUser("gold3", "1111"));
        main.printAll(goldUsers);




    }

    // 이전에 시도한 방식 (Object로 받는 방법) — 단점: 타입 안정성이 없음
//    public void printAll(Object list) {
//        for (Object s : (ArrayList) list) {
//            System.out.println(s);
//        }
//    }
    //Object list 로 해버리면 String 이 담긴 names 를 담을 수 없음
    // Object로 받으면 String이나 User 등 서로 다른 타입을 넣을 수 있어서
    // 실제로 내부에서 타입을 단정할 수 없다. (런타임 캐스팅 위험)

    //// 제네릭 와일드카드 사용
    public void printAll(ArrayList<? extends User> list) {   //User 를 상속받은 무언가 들어올 것을 유추 가능
        // ArrayList<? super GoldUser> list: super GoldUser 로 하면 User 뿐만 아닌 최상위 Object 까지 받는다는 의미이므로
        // '? extends User' 는 User 또는 User의 하위 타입
        // 따라서 ArrayList<User>, ArrayList<VipUser>, ArrayList<GoldUser> 모두 허용.
        // User s 로 한정지을 수 없음
//        String a = list.get(0);   //자료형을 단정지을 수 없음
        for (User s : list) {     //와일드카드를 써도 Object 써야함 - 안에 것 down 캐스팅해줘야하는 건 마찬가지
            System.out.println(s);
        }
    }

    //User 안의 기능을 쓰고 싶으면 extends User 해주면
    //-> User 클래스가 extends 된 제네릭을 쓸 수 있음

    //메서드 오버로딩해주어야함
//    public void printAll(ArrayList<String> list) {
//        for (String s : list) {
//            System.out.println(s);
//        }
//    }
//
//    public void printAll2(ArrayList<User> list) {
//        for (Uesr s : list) {
//            System.out.println(s);
//        }
//    }
}


/**
 * 와일드 카드 >>> '?' 기호
 * 어떤 타입인지 알 수 없다. 즉, 모든 타입을 유추하여 받을 수 있는 방법
 * 상한 경계 와일드카드: extends >>> ? extends User
 * 최대 업캐스팅 가능한 범위를 User 로 하겠다 즉 상한선을 정하겠다라는 의미
 * 하한 경계 와일드카드: super >>> ? super GoldUser
 * 해당 객체부터 상위로 모든 범위를 지정하겠다.
 * 즉, Object 부터 GoldUser 객체까지 하한선을 정하겠다는 의미
 *
 *
 * */
