package com.korit.study.ch19;

import java.util.Objects;

public class Car2 {
    private String model;
    private String color;

    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Car)) {
//            return false;  //타입확인
//        }
//        Car car = (Car) o;

//        if (!(o instancceof Car car)) return false;
//
//        return Objects.equals(model, car.model) && Objects.equals(color, car.color);


//    }
    // -> o 가 Car 타입이라면 Car 로 형변환해서 변수 car 로 사용?
    //(model, car.model) : this.model (car1) 과 car2.model 비교
    //(color, car.color) : this.model (car1) 과 car2.model 비교
    //자료형이 같아야 다운캐스팅이 가능하기 떄문에 instanceof 로 타입확인

    //        Collections.  //뒤에 s 붙는 건 Util 클래스
    //        //Objects.isNull(car) => car == null


    @Override
    public boolean equals(Object o) {
        if (o.getClass() != Car2.class) {       //Car.class : Car 클래스에 대한 모든 정보
            //-> 같은 클래스로 만들어졌는지 확인 -> Class class 개념
            return false;
        }
        Car2 car = (Car2) o;
//        if (!(o instancceof Car car)) return false;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
