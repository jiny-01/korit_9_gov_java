package com.korit.study.ch28;

interface ClickListener2 {
    void onClick();
}

class HomeButtonClickListener implements ClickListener {
    @Override
    public void onClick() {
        System.out.println("홈으로 이동합니다.");
    }
}

class LoginButtonClickListener implements ClickListener {
    @Override
    public void onClick() {
        System.out.println("로그인 화면으로 이동합니다.");
    }
}

class Button2 {
    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
}

public class ButtonMain2 {
    public static void main(String[] args) {
        //홈 버튼
        Button homeButton = new Button();
        HomeButtonClickListener homeButtonCliCkListener = new HomeButtonClickListener();
        homeButton.setClickListener(homeButtonCliCkListener);  //홈버튼에 set 으로 클릭리스ㅓㅌ 전달
        homeButton.click();

        //로그인 버튼
        Button loginButton = new Button();
        LoginButtonClickListener loginButtonCliCkListener = new LoginButtonClickListener();
        loginButton.setClickListener(loginButtonCliCkListener);  //홈버튼에 set 으로 클릭리스ㅓㅌ 전달
        homeButton.click();

        //회원가입버튼
        Button registerButton = new Button();
        ClickListener registerButtonClickListener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("회원가입 화면으로 이동합니다.");
            }
        };
        registerButton.setClickListener(registerButtonClickListener);
        registerButton.click();

        //람다함수 사용
        Button shopButton = new Button();
        shopButton.setClickListener(() -> System.out.println("상점으로 이동합니다."));
        shopButton.click();
    }
}
