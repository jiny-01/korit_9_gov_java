package com.korit.study.ch16.dto;

public class SigninDto {
    private String username;
    private String password;

    /*
    * 접근 제한자
    * public - 외부 패키지 참조 가능
    * private - 같은 패키지 내에서도 비공개, 같은 클래스일 때만 가능
    * => 자바에선 대부분 모든 변수는 private 으로 세팅함 (정보은닉, 캡슐화)
    *
    * private 같은 클래스에선 참조가능 - 외부에서 쓰려면 메서드로 우회 가능
    * 즉, 메서드가 public 이면 외부에서 호출 가능 (패키지 동일 여부 무관)
    *  */


    public SigninDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //getter & setter - 변수를 get, set 하는 것 (메소드가 아님) => 최소한의 캡슐화 목적, 단순히 데이터 보호
    //getter - 값을 가져와서 리턴
    //setter - 값 바꿀 때, 외부에서 가져온 값을 this.username 으로 대입
    //getter
    public String getUsername() {
        return username;
    }

    //setter
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // 안에 들어있는 값 확인하기 위한 단순 기능하는 함수
    @Override
    public String toString() {
        return "SigninDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
