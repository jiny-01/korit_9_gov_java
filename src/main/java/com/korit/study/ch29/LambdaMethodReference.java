package com.korit.study.ch29;

//람다 메서드 참조
// 람다식을 간결하게 표현하는 방법 (:: 더블콜론)
// 호출 구조가 기존의 메서드와 완전히 동일하면 가능
// (매개변수) -> 메서드(매개변수)

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class StrPrinter {
    public static void print(String str) {
        System.out.println(str);
    }
}

//Student 클래스 생성
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}






public class LambdaMethodReference {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = (s) -> System.out.println(s);
        stringConsumer.accept("람다 메서드 참조");

        Consumer<String> stringConsumer2 = (s) -> System.out.println(s);
        stringConsumer.accept("람다 메서드 참조2");

        Consumer<String> stringConsumer3 = System.out :: println;      //어디에서 어떤 메서드를 호출하는 지만 명시
        stringConsumer.accept("람다 메서드 참조");

        Consumer<String> stringConsumer4 = StrPrinter :: print;      //StrPrinter 안의 print 메서드
        stringConsumer.accept("람다 메서드 참조2");

        // 람다 생성자 참조 - 생성자도 메서드 종류 중 하나
        //매개변수 없으면 NoArguConstructor
        //supplier - 매개변수X
        Supplier<List<String>> listSupplier = ArrayList::new;     //ArrayList 의 생성자를 new

        Supplier<List<String>> listSupplier2 = () -> new ArrayList<>();
        List<String> stringList2 = listSupplier2.get();

        //매개변수 2개
        //종류 - BiConsumer, BiFunction, BiPredicate
        //BiFunction<T, U, R>
        BiFunction<String, Integer, Student> biFunction1 = (name, age) -> new Student(name, age);   //생성자 생성
        Student student1 = biFunction1.apply("김준일", 32);

        BiFunction<String, Integer, Student> biFunction2 = Student :: new;   //:: 이용해서 생성자 생성
        Student student2 = biFunction1.apply("김준일", 32);
        //apply 변수에 2개이므로 생성자에 변수도 2개 일치해야함

        System.out.println(student1);
        System.out.println(student2);

        Function<String, Integer> strToInt = Integer::parseInt;
        Integer num = strToInt.apply("100");
        System.out.println(num);

        //배열 요소 합
        List<String> strNums = List.of("10", "20", "30");
        Integer sumResult = 0;
        for (String str : strNums) {
            sumResult += Integer.parseInt(str);
        }
        System.out.println(sumResult);

        //set 해야하므로 Atomic
        AtomicInteger atomicSumResult = new AtomicInteger(0);
        strNums.forEach(str -> atomicSumResult.set(atomicSumResult.get() + Integer.parseInt(str)));
        System.out.println("atomicSumResult의 값: " + atomicSumResult);
        System.out.println("atomicSumResult의 값 get(): " + atomicSumResult.get());
        //출력할 때도 atomicSumResult.get() ???

        atomicSumResult.set(0);
        strNums.stream()
//                .map(str -> Integer.parseInt(str))
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(n -> atomicSumResult.set(atomicSumResult.get() + n));   //이떄는 :: 못씀
//                .forEach(atomicSumResult::set);     // 이렇게 n -> atomicSumResult.set(n) 처럼 바로 받을 때만 :: 사용가능
        System.out.println(atomicSumResult.get());


















    }
}
