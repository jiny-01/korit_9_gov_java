package com.korit.study.ch30;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Stream(흐름) -> 한 번 쓰면 재사용 불가
* 1. 생성 단계 - 스트림 객체 생성
* 2. 중간 연산 - 변환, 필터링 (반복)  - -> 최종에서 호출해야하므로 대부분 중간연산 리턴은 Stream()
* 3. 최종 연산 - 결과 도출 (반복)  -> forEach(), collect(), count(), sum()
*
*
* */
public class StreamMain {
    public static void main(String[] args) {
        // 1)스트림 사용 (출력)
        Stream<String> strStream = Stream.of("a", "b", "c");
        System.out.println(strStream.collect(Collectors.toList()));   // stream -> list 로 변환
        // 2) 스트림 사용 (출력)
        Stream<String> strStream2 = Stream.of("a", "b", "c");
        strStream2.forEach(System.out::println);

        //3) 스트림 사용
        Stream<String> strStream3 = Stream.of("a", "b", "c");
        strStream.forEach(s -> System.out.println(s));
//        strStream.forEach(System.out::println);

        strStream = Stream.of("a", "b", "c");    //쓰려면 다시 가져오기
        long c = strStream.count();
        System.out.println(c);

        //스트림 객체 생성
        // 1. Stream 인터페이스의 static 메서드를 통해 생성 - 방법 #1)
        // Array -> Stream
        //builder() 앞에 <String> 으로 명시해주면 Stream 객체를 String 을 담게 만들 수 있음
        Stream<String> stream = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();          //결과 - Object 인 Stream

        // 동일하게 a,b,c 가진 Stream 생성됨 => Arrays.stream(value) 와 같음
        //Stream 객체로 변환하기
        Stream<String> stream2 = Stream.of("a", "b", "C");              //#1

        // 2. 배열 또는 컬렉션을 Stream 으로 변환하여 생성 - 방법 #2)
        Stream<String> stream3 = Arrays.stream(new String[]{"a", "b", "c"});   //#2
        //.of() - 불변  / 배열은 크기가 정해져있으므로 원래 불변자료형
        Stream<String> stream4 = List.of("a", "b", "c").stream();              //#3
        Stream<String> stream5 = Set.of("a", "b", "c").stream();
        Stream<String> stream6 = Map.of("a", "1", "a", "1", "a", "1").keySet().stream();
        Stream<String> stream7 = Map.of("a", "1", "a", "1", "a", "1").values().stream();
        Stream<Map.Entry<String, String>> stream8 = Map.of("a", "1", "a", "1", "a", "1").entrySet().stream();  //entry 를 가지는 Stream

        List<String> names = List.of("김준일", "김준이");
        //#1)
        List<String> lastNames = new ArrayList<>();      //성만 따로
        for (String name : names) {
            String lastName = name.substring(0, 1);
            char lastName2 = name.charAt(0);
            lastNames.add(lastName);
        }
        lastNames.forEach(System.out::println);
        ////////////////////////////////////////////////////////////////////////////////////
        //#2)
        //map 돌려서 name 을 한글자 뽑아냅 -> list -> forEach 반복
        Stream<String> nameStream1 = names.stream();
        Stream<String> nameStream2 = nameStream1.map(name -> name.substring(0, 1));
        Stream<String> nameStream3 = nameStream2.map(name -> "[" + name + "]");
        List<String> names2 = nameStream3.collect(Collectors.toList());
        names2.forEach(System.out::println);
        ///////////////////////////////////////////////////////////////////////////////////////
        names.stream()
                .map(name -> name.substring(0, 1))  //map 으로 function 돌림
                .collect(Collectors.toList())
                .forEach(System.out::println);

        /// /////////////////////////////////////////////////////////////////////////////////
        names.stream()
                .map(name -> name.substring(0, 1))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //.map 말고도 . 찍어보고 리턴이 Stream 이면 중간연산으로 사용 가능한 메서드
        //리턴 Stream 아닌 Collection자료형, boolean => 최종 연산용 메서드


        //2. 중간 연산 map(), filter()
        //1) map() - 변환, 치환
        List<String> strNums = List.of("10", "20", "30");
        List<Integer> nums = StreamMap.map(strNums, strNum -> {
            int n = Integer.parseInt(strNum);
            if (n % 2 == 0) {
                return n * 10;  //여기서 List 의 자료형 R => Integer 인 것 확인가능
            }
            return n;
        });

        //2. filter() 분류
        List<Integer> odds = nums.stream()
                .filter(num -> num % 2 != 0)       //리턴값 true 일 때만 Stream 에 담김
                .toList();
        System.out.println(odds);
    }
        //map 돌려서 strNums 배열의 요소 strNum 뽑아내서 1) parseInt 로 숫자로 바꾸고 * 10 한 값들로 치환해서 => 객체 전달
        //이 식이 아래쪽 action.apply() 에 전달됨
        //apply() 호출 시마다 t = strNum
        //nums 라는 Integer 를 담는 배열에 담음
//        List<Integer> nums = StreamMap.map(strNums, strNum -> Integer.parseInt(strNum) * 10);    //map(list, function)
    }

    class StreamMap {
        public static <T, R> List<R> map(List<T> list, Function<T, R> action) {
            //T : String, R : Integer
            //.map 호출 -> 매개변수로 list, 함수로 action 받음
            //List<R> : 리스트의 자료형 -> R
            //.map 호출 시 어떤 타입으로 리턴인지 확인 가능
            //위에 StreamMap.map(strNums, strNum -> Integer.parseInt(strNum) * 10);  //여기서 List 의 자료형 R => Integer 인 것 확인가능
            //NULL 체크 #1)
            Objects.requireNonNull(list);    //자동 NULL 체크
            Objects.requireNonNull(action);

            //NULL 체크 #2)
//            if (Objects.isNull(list)) {    //null 이면
//                return null;
//            }
//            if (list.isEmpty()) {
//                return null;
//            }
            //list 를 매개변수로 받은 것을 반복돌려서
            List<R> rList = new ArrayList<>();
            for(T t : list) {
                rList.add(action.apply(t));     //반복돌려서 하나씩 꺼낸 값을 t로 function (즉, map 의 람다함수에) 에 전달
            }
            return rList;
        }
    }


