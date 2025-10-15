package com.korit.study.ch17;

public class AuthenticationMain {
    public static void main(String[] args) {
        String[] roles = {"ROLE_USER", "ROLE_ADMIN"};
        User user = new User("test", "1234", roles);   //유저 & 관리자 권한 동시 소유
        PrincipalAuthentication principal = new PrincipalAuthentication(user);

        principal.checkAuthority();
        System.out.println(principal.containsAuthority("user"));
        System.out.println(principal.containsAuthority("admin"));

    }
}
