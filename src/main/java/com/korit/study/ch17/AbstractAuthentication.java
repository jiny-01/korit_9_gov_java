package com.korit.study.ch17;

public abstract class AbstractAuthentication implements UserDetails {
    private User user;


    //PrincipalAuthentication 에서 user 를 안 가져올거라면 Noargu 있어야함
    public AbstractAuthentication() {
    }

    public User getUser() {
        return user;
    }

    public AbstractAuthentication(User user) {
        this.user = user;
    }

    public void auth() {
        System.out.println("인증을 합니다.");
    }

    //추상메서드
    //userDetails 에 추상메서드가 있으므로 추상메서드를 따로 구현해도 되고 안해도 됨
    public abstract void checkAuthority();





}
