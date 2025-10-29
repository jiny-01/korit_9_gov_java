package com.korit.study.ch30;


import java.sql.Struct;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        //문제1 : 문자열 대문자 변환
        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperNames); // [ALICE, BOB, CHARLIE, DAVID]

        //문제2 : 숫자 제곱 계산
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> multiple = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(multiple);

        //문제3 : 문자열 길이 추출
        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
        List<Integer> length = words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());
        System.out.println(length);

        //문제4 : 가격에 세금 추가
        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
        List<Double> newPrice = prices.stream()
                .map(price -> price + (price * 0.1))
                .collect(Collectors.toList());
        System.out.println(newPrice);

        //문제 5: 객체에서 특정 필드 추출
        class Person {
            private String name;
            private int age;
            // constructor, getters

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        List<String> namesList = people.stream()
                .map(person -> person.name)
                .collect(Collectors.toList());
        System.out.println(namesList);

        //문제6 : 문자열 포맷팅
        //각 사용자명을 "User: {username}" 형식으로 변환하세요.
        // 예상 출력: [User: john, User: mary, User: steve]
        List<String> usernames = Arrays.asList("john", "mary", "steve");
        List<String> formattedUsers = usernames.stream()
                .map(name -> String.format("User: %s", name))
                .collect(Collectors.toList());

        System.out.println(formattedUsers);

        //Employee를 EmployeeDTO로 변환하세요. 
        // displayName은 "Mr./Ms. {name}", 
        // salaryInfo는 "Salary: ${salary}" 
        // 예상 출력: [EmployeeDTO(Mr./Ms. Kim, Salary: $50000.0), ...]
        class Employee {
            String name;
            double salary;

            public Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }
            // constructor, getters
        }

        class EmployeeDTO {
            private String displayName;
            private String salaryInfo;

            public EmployeeDTO(String displayName, String salaryInfo) {
                this.displayName = displayName;
                this.salaryInfo = salaryInfo;
            }

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }

            public String getSalaryInfo() {
                return salaryInfo;
            }

            public void setSalaryInfo(String salaryInfo) {
                this.salaryInfo = salaryInfo;
            }

            @Override
            public String toString() {
                return "EmployeeDTO{" +
                        "displayName='" + displayName + '\'' +
                        ", salaryInfo='" + salaryInfo + '\'' +
                        '}';
            }

            // constructor, getters
        }

        //이건 그냥 list
        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );
        System.out.println(employees.stream().map(emp -> "Mr./Ms." + emp.name + "salary $" + emp.salary).toList());

        List<EmployeeDTO> employeeDTOList2 = employees.stream()
                .map(emp -> new EmployeeDTO(
                        "Mr. /Ms." + emp.name,        //"Mr./Ms. {name}",
                        "Salary: " + "$" + emp.salary            //"Salary: ${salary}"
                ))
                .collect(Collectors.toList());

        employeeDTOList2.forEach(dto ->
                System.out.println("결과: " + dto.getDisplayName() + ", " + dto.getSalaryInfo())
        );
        //=> 결과: Mr. /Ms.Lee, Salary: $60000.0

        List<EmployeeDTO> employeeDTOListResult = employees.stream()
                .map(emp -> new EmployeeDTO(
                        "Mr./Ms. " + emp.name,       // displayName
                        "Salary: $" + emp.salary                      // salaryInfo
                ))
                .toList();
        System.out.println("최종 결과: " + employeeDTOListResult);

        // 결과 출력
//        employeeDTOList.forEach(dto ->
//                System.out.println(dto.getDisplayName() + ", " + dto.getSalaryInfo())
//        );

        List<EmployeeDTO> employeeDTOList3 = employees.stream()
                .map(emp -> new EmployeeDTO(
                        "Mr./Ms. " + emp.name,
                        "Salary: $" + emp.salary
                ))
                .toList();

        // 출력
        System.out.println("이건가:" + employeeDTOList3);

/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //employ 정답 풀이
//        public EmployeeDTO toDto() {
//            return new EmployeeDTO(name, ((Double)salary).toString()
//        }
        //1. 문자열 첫 글자 추출
        //각 도시명의 첫 글자만 추출하여 문자 리스트를 생성하세요. 예상 출력: [S, B, I, D, G]
        List<String> cities = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");
        List<String> firstWord = cities.stream()
                .map(city -> city.substring(0, 1))
                .toList();
        System.out.println(firstWord);

        //2. 불린값 반전
        //각 불린 값을 반대로 변환하세요. 예상 출력: [false, true, false, false, true]
        List<Boolean> flags = Arrays.asList(true, false, true, true, false);
        List<Boolean> reverse = flags.stream()
                .map(flag -> !flag)
                .toList();
        System.out.println(reverse);

        //3. 온도 변환
        //섭씨 온도를 화씨로 변환하세요. 공식:(C × 9/5) + 32    예상 출력:[32.0, 77.0, 212.0, 14.0]
        List<Double> celsius = Arrays.asList(0.0, 25.0, 100.0, -10.0);
        List<Double> temp = celsius.stream()
                .map(c -> (c * 9 / 5) + 32)
                .toList();
        System.out.println(temp);

        //**문제 4: 문자열 앞뒤 공백 제거**
        List<String> messyData = Arrays.asList("  hello  ", "world   ", "  java", "   stream   ");
        //각 문자열의 앞뒤 공백을 제거하세요. 예상 출력  [hello, world, java, stream]`

        List<String> trimData = messyData.stream()
                .map(s -> s.trim())
                .toList();
        System.out.println(trimData);

        //문제5 :
        //각 이메일 주소에서 도메인 부분만 추출하세요.
        // (@ 이후 부분) 예상 출력: [gmail.com, company.co.kr, naver.com, daum.net]
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );

        List<String> domains = emails.stream()
                .map(e -> e.substring(e.indexOf("@") + 1))
                .toList();
        System.out.println(domains);

        //문제 6: 나이를 출생연도로 변환
        //각 나이를 출생연도로 변환하세요. 예상 출력: `[1999, 1994, 1989, 2004, 1979]`
        List<Integer> ages = Arrays.asList(25, 30, 35, 20, 45);
        int currentYear = 2024;

        List<Integer> birth = ages.stream()
                .map(age -> currentYear - age)
                .toList();
        System.out.println(birth);

        //문제 7: 상품명과 가격 결합
        //각 Item을 "상품명(가격원)" 형식의 문자열로 변환하세요. 예상 출력: [사과(3000원), 바나나(2000원), 오렌지(5000원)]
        class Item {
            String name;
            int price;
            // constructor, getters


            public Item(String name, int price) {
                this.name = name;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }

        List<Item> items = Arrays.asList(
                new Item("사과", 3000),
                new Item("바나나", 2000),
                new Item("오렌지", 5000)
        );

        //"상품명(가격원)"
        List<String> itemList = items.stream()
                .map(item -> String.format("%s(%d원)", item.getName(), item.getPrice()))
                .toList();
        System.out.println(itemList);

        //문제8 : 학생 성적 등급 변환
        //각 학생을 "{이름}: {등급}" 형식으로 변환하세요.
        // 등급 기준: 90이상 A, 80이상 B, 70이상 C, 그 외 D
        // 예상 출력: [김철수: A, 이영희: B, 박민수: C, 정지원: D]
        class Student {
            String name;
            int score;
            // constructor, getters

            public Student(String name, int score) {
                this.name = name;
                this.score = score;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }
        }

        List<Student> students = Arrays.asList(
                new Student("김철수", 95),
                new Student("이영희", 82),
                new Student("박민수", 76),
                new Student("정지원", 68)
        );

//        int grade = students.score > 90 ? "A" :
        List<String> gradeInfo = students.stream()
                .map(stu -> {
                    String grade =
                            stu.getScore() >= 90 ? "A" :
                                    stu.getScore() >= 80 ? "B" :
                                            stu.getScore() >= 70 ? "C" : "D";
                    return stu.getName() + ": " + grade;
                })
                .toList();
        System.out.println(gradeInfo);

        //문제 9: 파일 경로에서 파일명 추출
        //각 파일 경로에서 파일명만 추출하세요. (경로 구분자는 / 또는 \)
        // 예상 출력 `[report.pdf, system.log, image.jpg, music.mp3]`
        List<String> filePaths = Arrays.asList(
                "/home/user/documents/report.pdf",
                "/var/log/system.log",
                "C:\\Users\\Admin\\Desktop\\image.jpg",
                "/downloads/music.mp3"
        );

        List<String> fileName = filePaths.stream()
//                .map(f -> f.substring(f.indexOf("/") + 1))
                .map(f -> {
                    int index = Math.max(f.lastIndexOf("/"), f.lastIndexOf("\\"));
                    return f.substring(index + 1);
                })
                .toList();
        System.out.println(fileName);

        List<String> fileNames = filePaths.stream()
                .map(filePath -> {
                    String replaceStr = filePath.replaceAll("\\\\", "/");
                    return replaceStr.substring(replaceStr.lastIndexOf("/") + 1);
                })
                .toList();
        System.out.println("파일명: " + fileNames);

        //문제 10: 전화번호 포맷팅**
        //각 전화번호를 "010-XXXX-XXXX" 형식으로 변환하세요.
        // 예상 출력:`[010-1234-5678, 010-9876-5432, 010-5555-6666, 010-1111-2222]`
        List<String> phoneNumbers = Arrays.asList(
                "01012345678",
                "01098765432",
                "01055556666",
                "01011112222"
        );

        List<String> phone = phoneNumbers.stream()
                .map(p -> p.substring(0, 3) + "-" + p.substring(3, 7) + "-" + p.substring(7, 11))
                .toList();
        System.out.println(phone);

/// //////////////////////////////////////////////////////////////////////////////////////////////////////////////














    }



}

