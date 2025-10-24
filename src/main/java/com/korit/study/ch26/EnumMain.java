package com.korit.study.ch26;

//enum : 고정된 상수들의 집합”을 표현하는 특수한 클래스
enum Name {
    준일, 준이, 준삼
}

enum Name2 {
    N1("준일"), N2("준이"), N3("준삼");

    private final String value;     //enum 은 고정값을 쓰기 위한 목적이므로 final => 상수

    Name2(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    enum Writer {
        W1("김준일", 32), W2("김준이", 33), W3("김준삼", 34);

        private final String fullName;
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
            System.out.println(Name.준일);
            System.out.println(Name.준이);
            System.out.println(Name.준삼);
//        System.out.println(Name2.N1.getName());
            System.out.println(Name2.N1.value());   //자동으로 get 기능을 하는 변수명과 같은 메서드가 만들어짐
            System.out.println(Name2.N2);
            System.out.println(Name2.N3);

            System.out.println(Writer.W1.getFullName());
            System.out.println(Writer.W1.getFullName());
            Writer writer = Writer.W1;
            //enum : 백엔드 status.ok - 200, 400, 500 ...etc
        }
    }
}
