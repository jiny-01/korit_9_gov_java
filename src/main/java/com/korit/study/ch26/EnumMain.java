package com.korit.study.ch26;

//enum : 고정된 상수들의 집합”을 표현하는 특수한 클래스
//미리 정해진 값들만 써야 하는 경우 ex) 상태코드, 권한...
//객체처럼 동작하지만, 직접 new로 생성은 X, 미리 정의된 값만 존재

//단순 열거 enum
enum Name {
    준일, 준이, 준삼
}

//값을 가진 고정된 열거 enum
enum Name2 {
    N1("준일"), N2("준이"), N3("준삼");

    private final String value;     //enum 은 고정값을 쓰기 위한 목적이므로 final => 상수

    Name2(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}

//객체 형태를 지닌 복합 데이터를 가진 열거 enum
enum Writer {
    W1("김준일", 32), W2("김준이", 33), W3("김준삼", 34);
    //Writer.W1 은 new Writer("김준일", 32) 와 비슷하지만 생성, 수정은 불가한 고정된 값

    private final String fullName;   //enum 내 기본메서드인 .name 과 혼동 방지-변수명 변경
    private final Integer age;

    Writer(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }
}

// enumerated -> 열거, 나열
public class EnumMain {
    public static void main(String[] args) {
        System.out.println(Name.준일);    //준일
        System.out.println(Name.준이);    //준이
        System.out.println(Name.준삼);    //준삼
//        System.out.println(Name2.N1.getName());
        //자동으로 get 기능을 하는 변수명과 같은 메서드가 만들어짐
        System.out.println(Name2.N1.value());  //"준일"
        System.out.println(Name2.N2);          //"N2"
        System.out.println(Name2.N3);          //"N3"

        System.out.println(Writer.W1.getFullName());   //김준일
        System.out.println(Writer.W1.getFullName());   //김준이
        Writer writer = Writer.W1;
        //enum : 백엔드 HttpStatus - 200, 400, 500 ....etc
    }
}
