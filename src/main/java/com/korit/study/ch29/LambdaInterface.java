package com.korit.study.ch29;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.*;
import java.util.stream.Collectors;

public class LambdaInterface {
    public static void main(String[] args) {
        // 1. run() 매개변수 X, 리턴 X
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 인터페이스");
            }
        };
        runnable.run();

        Runnable runnable2 = () -> {
            System.out.println("runnable 인터페이스");
        };
        runnable2.run();

        // 2. consumer 매개변수 O, 리턴 X
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("consumer 인터페이스");
                System.out.println("매개변수 s : " + s);
            }
        };
        stringConsumer.accept("consumer");


        Consumer<String> stringConsumer2 = s -> {
            System.out.println("consumer 인터페이스");
            System.out.println("매개변수 s: " + s);
        };
        stringConsumer2.accept("consumer");

        //1) andThenStudy에 accept 하면 10
        Consumer<Integer> andThenStudy = num -> {
            System.out.println("1");
            System.out.println("결과1: " + num);   //-> 결과1: 10 - 1번만 호출
        };
        //2) andThenStudy2에 accept 하면 10
        Consumer<Integer> andThenStudy2 = andThenStudy.andThen(num2 -> {
            System.out.println("2");
            System.out.println("결과2: " + num2);
        });

        andThenStudy.accept(10);
        andThenStudy2.accept(20);

        //하나의 accept 값으로 순서대로 동작시킬 때
        Consumer<Double> doubleConsumer = d -> {
            System.out.println("1");
            System.out.println("숫자: " + d);
        };
        doubleConsumer.andThen(d -> {
            System.out.println("2");
            System.out.println("숫자: " + d);
        }).andThen(d -> {
            System.out.println("3");
            System.out.println("숫자: " + d);
        }).andThen(d -> {
            System.out.println("4");
            System.out.println("숫자: " + d);
        }).accept(3.14);

        //forEach()
        List<String> nameList = List.of("김준일", "김준이");
        nameList.forEach(n -> System.out.println(n));  //생성과 동시에 구현하는 것, 람다함수의 메서드 = action
        nameList.forEach(System.out :: println);
        //:: - 더블콜론
        //람다의 메서드 참조


        //forEach()
//        default void forEach(Consumer<? super T> action) {       //action : Consumer 객체, 람다함수 내 메서드가 실행되어 생성된 결과
//            Objects.requireNonNull(action);
//            for (T t : this) {
//                action.accept(t);                                 //action 객체
//            }
//        }

        //3. supplier - 매개변수 X, 리턴 O - boolean
        String str = null;
        Supplier<Boolean> booleanSupplier = () -> Objects.isNull(str);
        System.out.println(booleanSupplier.get());

        //4. 매개변수 O, 리턴 O
//        Function<Integer, String> function = num -> "num: " + num;
//        String functionResult = function.apply(10);
//        System.out.println(functionResult);


        Function<Integer, String> function = num -> {
            System.out.println("정수 받아서 문자열 정수로 리턴: ");
            return Integer.toString(num);
        };

//        String functionResult = function.apply(10);
//        System.out.println(functionResult);              //결과: 문자열 10

        Integer functionResult2 = function
                .andThen(s -> {
                    System.out.println("문자열 정수 받아서 실수자료형으로 리턴: ");
                    return Double.parseDouble(s);
                }).andThen(d -> {
                    System.out.println("실수 자료형 받아서 정수로 리턴");
                    return d.intValue();
                }).apply(20);

        System.out.println(functionResult2);

//        String functionResult2 = function.andThen(num -> "num2: " + num).apply(20);
//        System.out.println(functionResult2);
//
//        String functionResult3 = function.andThen(s -> "test" +  s).apply(20);
//        System.out.println(functionResult2);

        //andThen(s -> "test" +  s) -> 그대로 String
        //andThen(s -> Double.parseDouble(s))

//        default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
//            Objects.requireNonNull(after);
//            return (T t) -> after.apply(apply(t));
//        }
        //원래 Function<T, R>
        //.andThen() 호출 시 (T t) -> after.apply(apply(t)); 이 함수. 즉 Function 객체가 호출된 것
        // 이 객체가 after 를 apply - 즉, t = 20
        //apply(20) - 자기자신에 apply 해줌 => num -> Integer.toString(num) 실행 -> 리턴: 문자열 20
        //


        String functionResult3 = function
                .compose(d -> {
                    System.out.println("실수 자료형을 정수로 리턴:");
                    return ((Double) d).intValue();   //boxing 을 해주고 intValue 로
                }).apply(20.5);

        System.out.println(functionResult3);

        //compose : 전처리 -> 최종 자료형 -> function
        //andThen : 후처리 -> andThen 의 자료형
        //compose -> function 호출 -> andThen

        //4. Predicate - 매개변수 O, 리턴 Boolean
        String searchUsername = "test1234";
        Predicate<List<Map<String, String>>> listPredicate = list -> {
            //람다 밖에서 선언된 변수를 람다 안에서 바꿀 수 없다
            //=> AtomicBoolean 자료형 이용

            AtomicBoolean isFound = new AtomicBoolean();
            list.forEach(map -> {
                if (map.get("username").equals(searchUsername)) {
//                    isFound = true;    //람다식 안에서 밖의 변수를 바꿀 수 없음
                    isFound.set(true);
                }
            });
//            return isFound;
            return isFound.get();
        };

        List<Map<String, String>> userList = List.of(
                Map.of("username", "test1", "password", "1111"),
                Map.of("username", "test12", "password", "2222"),
                Map.of("username", "test123", "password", "3333"),
                Map.of("username", "test1234", "password", "4444")
        );
        System.out.println(listPredicate.test(userList));  //=> 결과 boolean 타입으로 출력

////////////////////////////////////////////////////////////////////////////////////////
//        Stream
        //stream() - 반복해서 연결짓는 것
        List<String> names = List.of("김준일", "김준이", "이준일", "이준이");
        String startedLastName = "이";
        //리스트를 통째로 들고옴 - "이" 로 시작하는 것 => 여러 개 결과 => 리스트
        List<String> filteringNames = names.stream()
                .filter(name -> name.startsWith(startedLastName))
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println("이로 시작: " + filteringNames);
        //=> [이준일, 이준이]

        String foundName = names.stream()
                .filter(name -> name.equals("김준이"))   //필터링해서 하나만 찾음
                .collect(Collectors.toList())      //동일한 결과 값 (1개) 찾아서 리스트에 넣어두고
                .getFirst();                        //가져와라
        System.out.println(foundName);


        //Function 에서 매개변수 O, 리턴 O , 둘의 자료형이 동일하면
        UnaryOperator<String> f1 = s -> s + "문자열";    //#1
        Function<String, String> f2 = s -> s + "문자열";   //#2
        BiFunction<String, String, String> f3 = (s1, s2) -> s1 + s2;
        BinaryOperator<String> f4 = (s1, s2) -> s1 + s2;




    }
}
