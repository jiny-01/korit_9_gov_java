package com.korit.study.ch24;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        // 문자열을 담을 수 있는 ArrayList 생성;
//        ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();  //List 로 하면 ArrayList, LinkedList 모두 가능
        // 인터페이스가 List 로 통일되어있음
        // ArrayList, LinkedList 각각의 메서드를 쓸려면 다운캐스팅해야함
        //즉, Collections<String> list 로 쓰지 않는 이유
        // list 에선 get, set 쓸 수 있지만 Set 자료형에서는 못 쓰기 때문
        // Collections 는 공통적인 메서드들만 구현
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
        //ArrayList - index 로 remove 하는 것이 성능적으로 우수함

        // 리스트의 크기(사이즈)
        int size = list.size();

        // 리스트 안에 값이 포함되어 있는지 확인
        //contains("찾는 값") - 리턴 boolean -> 조건문에서 사용 가능
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



        // 같은 값 2개 이상일 떄 찾는 로직 - 중간에 위치하고 있는 데이터 30의 index 를 찾는 방법
        int start = list.indexOf("30") + 1; //첫번째 30보다 +1 한 인덱스부터
        indexOf30 = -1;
        for (int i = start; i < list.size(); i++) {
            if(list.get(i).equals("30")) {   //i = 3 일 때 break 걸어줘야함 - 계속 찾기 때문에 마지막 30의 인덱스가 나옴
                indexOf30 = i;
                break;
            }
        }

        //거꾸로 찾기 - 시간복잡도가 오래걸릴 가능성 높음
        //대부분은 앞에서부터 선형탐색하면서 +1 해줌
        int last = list.indexOf("30") + 1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("30")) {   //i = 3 일 때 break 걸어줘야함 - 계속 찾기 때문에 마지막 30의 인덱스가 나옴
                indexOf30 = i;
                break;
            }
        }

        // 리스트 자르기 (처음, 끝) -> 끝 - 1 까지만 리스트로 만들어서 출력
        List<String> subList = list.subList(list.indexOf("30") + 1, list.size());  //찾은 다음 인덱스 ~ 리스트 크기
        subList.indexOf("30");
//        System.out.println(list.subList(0, 2));
        subList.add("40");
        System.out.println(subList);
        // List 로 리턴해주지만 .add 가 가능하므로 새로운 ArrayList 로 볼 수 있음

        //기존 배열을 건드리는 것이 아닌 자른 리스트는 새로 생성해서 메모리 공간이 다름

//        LinkedList<String> linkedList = new LinkedList<>();
        List<String> linkedList = new LinkedList<>();  //업캐스팅 가능 - List 로 인터페이스가 같음
        linkedList.add("10");
        linkedList.add("20");
        linkedList.add("30");
        linkedList.add("40");
        linkedList.indexOf("30");
        // LinkedList - 노드로 연결되어 있음 head, tail
        // 다음 노드의 주소값, 데이터 가지고 있음
        linkedList.get(1);


//=====================================================================================
        // Set(집합)
        // 값 추가
        Set<String> strSet = new HashSet<>();
        strSet.add("가");
        strSet.add("나");
        strSet.add("다");
        System.out.println(strSet);
        //해시 값에 의해 정렬이 된 것 -> [가, 다, 나]

        // 값 조회
//        for (int i = 0; i < strSet.size; i++) {
//
//        }

        String r1 = null;
        String setSearchValue = "다";
        for (String s : strSet) {
            if (s.equals("다")) {
                r1 = s;
                break;
            }
        }
        System.out.println(r1);
        if (strSet.contains(setSearchValue)) {
            r1 = setSearchValue;
        }

        // 값 삭제
        strSet.remove("나");
        System.out.println(strSet);

        // 값 수정
        strSet.remove("다");
        strSet.add("라");

        // 리스트 -> 세트
        List<String> a = new ArrayList<>();
        a.add("가");
        a.add("가");
        a.add("나");
        a.add("나");
        a.add("다");
        a.add("라");

        Set<String> b = new HashSet<>();
        for (String s : a) {
            b.add(s);
        }
        System.out.println(b);
        Set<String> c = new HashSet<>();
        c.addAll(a);
        System.out.println(c);
        //addAll 의 매개변수 - Collections
        //매개변수가 Collections 라면
        //arraylist, linkedlist, set, map 다 가능하기 때문

        // 세트 -> 리스트
        List<String> d = new ArrayList<>();
        d.addAll(c);

        d.add(1, "test");

        // Map(키 + 값 쌍 -> 집합)
        Map<String, String> strMap = new HashMap<>();

        // 값 추가
        strMap.put("a", "김준일");
        strMap.put("f", "김준이");
        strMap.put("c", "김준삼");
        strMap.put("d", "김준사");
        strMap.put("d", "김준오");
        //키 값 중복 불가능하므로 뒤에 걸로 덮어씀 => 수정 의미
        System.out.println(strMap);

        //Map 을 쓰면 키값을 정할 수 있음

        // 값 조회
        String mapValue = strMap.get("c");
        System.out.println(mapValue);
        String mapValue2 = strMap.getOrDefault("g", "기본값");
        System.out.println(mapValue2);

        // 값 수정
        strMap.put("g", "김준육");
        System.out.println(strMap);

        System.out.println(strMap.remove("a"));   // a 지워짐
        System.out.println(strMap.remove("a"));   //위에서 지워져서 null
        System.out.println(strMap.remove("b", "김준육"));   //key-value 쌍이 일치하지 않아서 실패
        System.out.println(strMap.remove("b", "김준이"));


//        Map -> Set 변환
//        Set<Map.Entry<String, String>> toSet = strMap.entrySet();
//        System.out.println(toSet);
//        for (String e : toSet) {
//            System.out.println(e);
//        }

        // Map 을 반복 작업하는 방법
        // Map 자료형을 Entry 가 들어있는 Set 자료형으로 형 변환
        for( Map.Entry<String, String> entry : strMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
            System.out.println("키 : " + entry.getKey() + " 값: " + entry.getValue());
        }
        // -> [c="김준삼", d="김준오"]
        //자바에선 [] 아니면 반복 돌릴 수 없음

        // value 만 COllection(Set) 으로 가져오기
        Set<String> valuesSet = new HashSet<>();
        valuesSet.addAll(strMap.values());
        //value 들만 가져와서 넣으므로 중복제거되어서 set 으로 들어감
        strMap.keySet();
        System.out.println(strMap.keySet());

        //데이터 담을 때
        //중괄호 {} => Map
        //대괄호 [] => List, 배열
        //set 은 따로 명시























    }
}
