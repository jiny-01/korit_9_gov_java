package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        // 문자열을 담을 수 있는 ArrayList 생성;
        ArrayList<String> list = new ArrayList<>();

        // add() - 값을 추가
        list.add("문자열 값1");
        list.add("문자열 값");

        // get(인덱스) - 값을 가져오기
        String str = list.get(0);
        String str2 = list.get(1);

        // set(인덱스, 수정할 값) - 값 수정
        String str3 = list.set(1, "문자열 값3");
        System.out.println(str3);

        //remove(object "값"), remove(index 숫자), 값 삭제
        boolean removed = list.remove("문자열 값1");    //1) object 로 특정 요소 삭제 -> 리턴 boolean
        String str4 = list.remove(0);    //2) index 로 삭제 -> 리턴 String
        System.out.println(removed);
        System.out.println(str4);
        // 제거한다 = 나머지 남은 것의 인덱스를 하나 작은 배열을 만들어 index - 1 한 값으로 옮겨주는 것
        //현재 위치로부터 나보다 작으면 그대로
        //크면 인덱스 - 1 해준 자리에 배치하는 알고리즘

        // 리스트의 크기(사이즈)
        int size = list.size();

        // 리스트 안에 값이 포함되어 있는지 확인
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("30");
        list.add("30");
        list.contains("20");
        System.out.println(list.contains("50"));

        //리스트 안에서 값이 위치하고 있는 Index 를 찾기
        int indexOf30 = list.indexOf("30");       //앞에서부터 찾음
        System.out.println(indexOf30);  //값 중복 시 처음 찾은 인덱스

        indexOf30 = list.lastIndexOf("30");    //뒤에서부터 찾음
        System.out.println(indexOf30);

        // 리스트 자르기
        List<String> subList = list.subList(list.indexOf("30") + 1, list.size());  //찾은 다음 인덱스 ~ 리스트 크기
        subList.indexOf("30");
//        System.out.println(list.subList(0, 2));

        // 같은 값 2개 이상일 떄 찾는 로직 - 중간에 위치하고 있는 데이터 30의 index 를 찾는 방법
        int start = list.indexOf("30") + 1; //첫번째 30보다 +1 한 인덱스부터
        indexOf30 = -1;
        for (int i = start; i < list.size(); i++) {
            if(list.get(i).equals("30")) {   //i = 3 일 때 break 걸어줘야함 - 계속 찾기 때문에 마지막 30의 인덱스가 나옴
                indexOf30 = i;
                break;
            }
        }

        int last = list.indexOf("30") + 1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("30")) {   //i = 3 일 때 break 걸어줘야함 - 계속 찾기 때문에 마지막 30의 인덱스가 나옴
                indexOf30 = i;
                break;
            }
        }







    }
}
