package com.korit.study.ch07;

import java.util.Scanner;

public class ArrayListFunction {

    //리턴값 없음, 출력만 가능하게 함수 정의
    //매개변수 이름은 달라도 됨
    public static void printNameAll(String[] names) {
        if (names.length == 0) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름(" + i + "): " + names[i]);    //names 의 인덱스별 이름 출력

            }
        }
    }

    //배열에 추가하는 함수 - 추가할 값, 기존 배열 매개변수로
    public static String[] addToArray(String value, String[] currentArray) {
        String[] newArray = new String[currentArray.length + 1];   //기존 names 보다 크기가 1만큼 큰 newNames 배열 만들기 - 현재 1칸 있는 names
        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i];  //동일한 인덱스 값으로 옮겨줌 - newNames2 에 0번 = names 0번 값 같도록
        }
        newArray[newArray.length - 1] = value;   // 배열의 마지막 인덱스에 value 추가
        return newArray;
    }

    //입력값 입력하는 함수
    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름입력: ");
        return scanner.nextLine();  //name 이란 변수에 입력값 담김
    }


    //배열에 scanner 로 입력받은 새로운 값 추가
    public static String[] addInputNameToNames(String[] names) {
        String name = inputName();
        return addToArray(name, names);
           //newNames 안에 새로 이름 입력된 names 배열 들어감
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        printNameAll(names);    //출력하는 함수 호출 - names 넘겨줌

        names = addInputNameToNames(names);    //대입 -> 값을 전달
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);




    }
}
