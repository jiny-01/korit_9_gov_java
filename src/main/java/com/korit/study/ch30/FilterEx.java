package com.korit.study.ch30;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {
    public static void main(String[] args) {
        //문제 1: 짝수만 필터링
        //짝수만 필터링하여 새로운 리스트를 생성하세요. 예상 출력:[2, 4, 6, 8, 10]
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evens = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evens);

        //문제 2: 특정 길이 이상인 문자열 필터링 길이가 5 이상인 단어
        List<String> words2 = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");
        List<String> wordsList = words2.stream()
                .filter(word -> words2.size() >= 5)
                .toList();
        System.out.println(wordsList);

        //**문제 3: 특정 문자로 시작하는 이름 필터링**
        //'A'로 시작하는 이름만 필터링하세요. 예상 출력: `[Alice, Anna, Andrew]`
        List<String> names3 = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");
        List<String> namesList2 = names3.stream()
                .filter(n3 -> n3.startsWith("A"))
                .toList();
        System.out.println(namesList2);

        //**문제 4: 음수 제거**
        //양수(0 포함)만 필터링하세요. 예상 출력: `[3, 8, 0, 7, 4]`
        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);

        List<Integer> filteredNumbers = mixedNumbers.stream()
                .filter(n -> n >= 0)   // 0 포함 양수만 통과
                .toList();

        System.out.println(filteredNumbers); // [3, 8, 0, 7, 4]

        //문제 5
        class Product {
            String name;
            int price;

            public Product(String name, int price) {
                this.name = name;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public int getPrice() {
                return price;
            }

            @Override
            public String toString() {
                return name + "(" + price + "원)";
            }
        }

        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );

        // 5만 ~ 30만 원 범위의 상품만 필터링
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getPrice() >= 50000 && p.getPrice() <= 300000)
                .toList();

        System.out.println(filteredProducts); // [키보드(80000원), 모니터(300000원)]

        //문제 6
        List<String> emails2 = Arrays.asList(
                "user1@gmail.com",
                "admin@company.com",
                "support@gmail.com",
                "info@naver.com",
                "hello@gmail.com",
                "test@daum.net"
        );

        // Gmail 계정만 필터링
        List<String> gmailList = emails2.stream()
                .filter(email -> email.endsWith("@gmail.com"))
                .toList();

        System.out.println(gmailList);
        // 출력: [user1@gmail.com, support@gmail.com, hello@gmail.com]

        //문제7
        class Person2 {
            String name;
            int age;
            // constructor, getters

            public Person2(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        List<Person2> people2 = Arrays.asList(
                new Person2("김철수", 25),
                new Person2("이영희", 17),
                new Person2("박민수", 30),
                new Person2("정지원", 16),
                new Person2("최수현", 22)
        );

        List<Person2> adult = people2.stream()
                .filter(p -> p.getAge() >= 19)
                .toList();
        System.out.println(adult);

        //출력형태
        List<String> result = adult.stream()
                .map(p -> p.getName() + "(" + p.getAge() + ")")
                .toList();

        //문제 8
        //**문제 8: 합격자 필터링**
        class Student {
            String name;
            int mathScore;
            int englishScore;

            public Student(String name, int mathScore, int englishScore) {
                this.name = name;
                this.mathScore = mathScore;
                this.englishScore = englishScore;
            }

            public String getName() {
                return name;
            }

            public int getMathScore() {
                return mathScore;
            }

            public int getEnglishScore() {
                return englishScore;
            }

            // constructor, getters
        }

        List<Student> students = Arrays.asList(
                new Student("김철수", 85, 90),
                new Student("이영희", 92, 88),
                new Student("박민수", 65, 70),
                new Student("정지원", 78, 85),
                new Student("최수현", 95, 92)
        );
        //수학과 영어 점수가 모두 80점 이상인 학생만 필터링하세요. 예상 출력: `[김철수, 이영희, 최수현]`

        // 수학과 영어 모두 80점 이상인 학생 필터링
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getMathScore() >= 80 && student.getEnglishScore() >= 80)
                .toList();

        // 이름만 추출
        List<String> onlyNames = filteredStudents.stream()
                .map(Student::getName)
                .toList();

        System.out.println(onlyNames);
        // 출력: [김철수, 이영희, 최수현]

        //문제9 : 특정 키워드 포함 여부
        List<String> articles = Arrays.asList(
                "Java 프로그래밍 기초",
                "Python으로 배우는 머신러닝",
                "Java Stream API 완벽 가이드",
                "JavaScript 최신 기능",
                "Java Spring Boot 실전",
                "React 입문 강좌"
        );

        // 제목에 "Java"가 포함된 글만 필터링
        List<String> javaArticles = articles.stream()
                .filter(title -> title.contains("Java"))
                .toList();

        System.out.println(javaArticles);


        //문제 10: 재고가 있고 할인 중인 상품 필터링
        class Item {
            String name;
            int stock;
            boolean onSale;
            int price;
            // constructor, getters


            public Item(String name, int stock, boolean onSale, int price) {
                this.name = name;
                this.stock = stock;
                this.onSale = onSale;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public int getStock() {
                return stock;
            }

            public boolean isOnSale() {
                return onSale;
            }

            public int getPrice() {
                return price;
            }
        }
        //
        List<Item> items2 = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("웹캠", 0, false, 60000)
        );

        // 필터 : 재고 > 0, onSale == true
        List<Item> filteredItems = items2.stream()
                .filter(item -> item.getStock() > 0 && item.isOnSale())
                .toList();

        List<Item> filteringItems = items2.stream()
                .filter(item -> item.stock > 0 && item.onSale)
                .toList();
        System.out.println(filteringItems);

        // 이름만 출력
        List<String> itemNames = filteredItems.stream()
                .map(Item::getName)
                .toList();

        System.out.println(itemNames);

        //보너스 1: null 아닌 값만 필터링
        List<String> data = Arrays.asList("apple", null, "banana", "", null, "cherry", "");


//        List<String> filteredData = data.stream()
//                .map(d -> d.replaceAll("", null))
//                .filter(s -> !s.isEmpty())
//                .toList();

        List<String> filtered2 = data.stream()
                .filter(p -> p != null && !p.isBlank())
                .toList();

        System.out.println(filtered2);

        //보너스 2: 중복되지 않은 숫자 필터링
        //리스트에서 한 번만 등장하는 숫자만 필터링하세요. 예상 출력: [1, 4, 6, 7, 8] 힌트: Collections.frequency() 활용
        List<Integer> checkNumbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> oneNumbers = checkNumbers.stream()
                .filter(n -> Collections.frequency(checkNumbers, n) == 1)
                .collect(Collectors.toList());

        System.out.println(oneNumbers);  // 출력: [1, 4, 6, 7, 8]

        //방법#2
        List<Integer>filteringNumbers = checkNumbers.stream()
                .filter(num2 -> checkNumbers.stream().filter(num3 -> num3 == num2).count() == 1)
                //처음에 1이 나오면 리스트에서 1인 것을 뽑아서 count 확인 (중복이면 2 이상, 1: 1개, 중복X)
            .toList();
        System.out.println(filteringNumbers);

        //일반 반복
        List<Integer> filteringNumbers2 = new ArrayList<>();
        for (Integer num : checkNumbers) {
            int count = 0;
            for (Integer num2 : checkNumbers) {
                if (num2 == num) {
                    count++;
                }
            }
            if (count == 1) {
                filteringNumbers2.add(num);
            }
        }
        System.out.println(filteringNumbers2);

        //        //보너스 3: 주말 날짜만 필터링
        //토, 일요일만 필터링
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );

        System.out.println(LocalDate.of(2024, 1, 6).getDayOfWeek());

        List<LocalDate> filteringDates = dates.stream()
                .filter(localDate -> localDate.getDayOfWeek().name().equals("SATURDAY")
                || localDate.getDayOfWeek().name().equals("SUNDAY"))
                .toList();
        System.out.println("주말: " + filteringDates);

        List<LocalDate> weekends = dates.stream()
                .filter(date -> date.getDayOfWeek() == DayOfWeek.SATURDAY
                        || date.getDayOfWeek() == DayOfWeek.SUNDAY)
                .collect(Collectors.toList());

        System.out.println(weekends);




    }






//        List<LocalDate> weekend = dates.stream()
//                .filter(d -> d.getDayOfWeek() == )



//        List<LocalDate> weekends = dates.stream()
//                .filter(date -> date.getDayOfWeek() == DayOfWeek.SATURDAY
//                        || date.getDayOfWeek() == DayOfWeek.SUNDAY)
//                .collect(Collectors.toList());
//
//        System.out.println(weekends);


    }



