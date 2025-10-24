package com.korit.study.ch26;

import java.util.List;

public class RoleMain {
    public static void main(String[] args) {
        //정해진 값들로 생성되는 객체
        // 여러 개 생성될 필요 없음
 //////////////////////////////////////////////////////////////////////////////////
        // 이건 선택 불가능, 정해진 값, 변수화 불가능
        Role admin = Role.ADMIN;
        Role user = Role.USER;
        Role manager = Role.MANAGER;

        System.out.println(admin);
        System.out.println(user);
        System.out.println(manager);

/// ////////////////////////////////////////////////////////////////////////////
        // .valueOf() - 문자열을 받으므로 값을 선택할 수 있음 - 변수화 가능
        Role admin2 = Role.valueOf("ADMIN");
        Role user2 = Role.valueOf("USER");
        Role manager2 = Role.valueOf("MANAGER");

        System.out.println(admin2);
        System.out.println(user2);
        System.out.println(manager2);

/////////////////////////////////////////////////////////////////////////////////

        List<String> roles = List.of("ADMIN", "USER");
        List<String> roles2 = List.of("ADMIN", "MANAGER");

        for (String roleName : roles){
            System.out.println("roles valueOf 사용 : " + Role.valueOf(roleName));   // -> "ADMIN", "USER"
        }

        for (String roleName2 : roles2){
            System.out.println("Roles2.valueOf 사용2 : " + Role.valueOf(roleName2));   // -> "ADMIN", "MANAGER"
        }
    }



}
