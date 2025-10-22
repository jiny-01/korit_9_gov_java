package com.korit.study.ch23;

public class Generic<T, T2> {
    private T data;   //T 가 아니어도 대문자, 한 글자면 가능
    private T data2;
    private Double data3;
    private T2 data4;
    private T[] arr;   //배열 선언은 가능
    //T : Type, R: R: Return 리턴타입, E: element 요소,


    public Generic(T data, T data2, Double data3, T2 data4) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
//        arr = new T[10];  //제네릭 타입으로는 배열 생성 불가능
    }

    public T getData() {
        return data;
    }


}
