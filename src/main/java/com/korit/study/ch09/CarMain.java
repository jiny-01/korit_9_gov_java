package com.korit.study.ch09;




class Car {
    String model;
    String color;

}



public class CarMain {
    public static void main(String[] args) {
        String model1 = "소나타";
        String color1 = "검정색";
        String model2 = "아반떼";
        String color2 = "파랑색";

        String[] models = new String[100000];
        String[] colors = new String[100000];
        models[99954] = "소나타";
        colors[99954] = "검정색";
        //배열의 인덱스 번호가 동일하면 묶어서 가져올 수 있음


        Car c1 = new Car();
        c1.model = "소나타";
        c1.color = "검정색";

        Car c2 = new Car();
        c2.model = "아반떼";
        c2.color = "파랑색";

        Car c3 = new Car();
        System.out.println(c3.model);    //인스턴스는 생성 시 기본값으로 초기화 => 출력: null

        //int = 0 / double = 0.0 / String = null / char = 유니코드 0 / boolean = false



//        int a;
//        System.out.println(a);   //에러: 변수는 무조건 초기화








    }
}
