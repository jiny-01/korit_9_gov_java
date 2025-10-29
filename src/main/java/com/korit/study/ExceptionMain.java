package com.korit.study;

import java.io.IOException;
import java.util.List;

/*

* 예외처리 (Exception or Error)
* 오류가 났을 때 프로그램이 강제 종료되는 것을 방지하기 위한 목적으로 사용
* Throwable -> Compile Error (실행 전), Runtime Error (실행 중)
* Throwable -> Error(오류), Exception(예외)
* 오류 => 실행 전 (사용자 제어 불가)
* -> OutOfMemoryError (메모리 공간 부족),
* -> StackOverflowError() - 메모리 공간 부족에러 종류  => 실행 전 오류 발생
* 예외 => 실행 중 (사용자 제어 가능) ->
* Exception
*   1. IOException (checked Exception) - 무조건 처리
*   2. SQLException (checked Exception)
*   3. RuntimeException (unchecked Exception) - 처리해도 되고 안해도 됨
* 런타임 시 발생하는 에러만 사용자 제어 가능함
* -> RuntimeException (실행 중 예외)을 상속 받은 모든 Exception (오류)
*
* checked Exception -> 컴파일 타임 예외
*   1. 컴파일 시점에 확인되는 예외
*   2. 반드시 처리해야하는 예외
*   3. 파일, 네트워크, 데이터베이스 연결 처리
*
*   Unchecked Exception -> 런타임 예외
*   1. 실행 중 발생하는 예외
*   2. 처리를 선택적으로 해줄 수 있음
*   3. 주소 참조, 실행 도중 자원(쓰레드, 인스턴스) 의 부재
*   4. RuntimeException 을 상속받음
*
*
* */
public class ExceptionMain {
    public static void main(String[] args) {
        int count = 0;
        while (true) {                  //매 반복마다 name 변수에 "김준일" 저장
            String name = "김준일";
            if (count == 10) {          //10번째 반복 시점에 name을 null 로
                name = null;            // → 즉, 10번까지는 "김준일",
                //11번째(count == 10)부터는 null 값
            }

            //try { System.out.println(name.startsWith("김")); }
            //name 문자열이 "김"으로 시작하는지 검사
            //"김준일"일 때 → "true" 출력
            //하지만 name == null일 때 → NullPointerException 발생
            try {
                System.out.println(name.startsWith("김"));
            } catch (NullPointerException e) {
                e.printStackTrace();           //어떤 예외인지 출력해줌
                break;
            }
            System.out.println(name.startsWith("김"));
            count++;
        }
        System.out.println("프로그램 정상 종료");

        //ArrayIndexOutOfBoundsException 터질 것
//        String[] names = {"김준일", "김준이"};
//        for (int i = 0; i < names.length + 1; i++) {      //인덱스 에러 ArrayIndexOutOfBoundsException
//            System.out.println(names[i]);
//        }
//        System.out.println("프로그램 정상 종료");

        //예외처리하기
        try {                                                 //try 안에 예외가 터질 것 같은 부분 다 넣기
            String[] names = {"김준일", "김준이"};
            for (int i = 0; i < names.length + 1; i++) {      //인덱스 에러 ArrayIndexOutOfBoundsException
                System.out.println(names[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");

        try {
            printAll(List.of(10, 20, 30, 40), 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            printAll2(List.of(10, 20, 30, 40), 5);
        } catch (IOException e) {

        }

        try {
            printAll3(List.of(10, 20, 30, 40), 5);
        } catch (ArrayIndexOutOfBoundsException e) {

        }


    }



        public static void printAll(List<Integer> nums, int size) {
            for (int i = 0; i < size; i++) {
                System.out.println(nums.get(i));
            }
        }

        public static void printAll2(List<Integer> nums, int size) throws IOException {
            for (int i = 0; i < size; i++) {
                System.out.println(nums.get(i));
            }
        }

        //ArrayIndexOutOfBoundsException : RuntimeError 상속 -> unchecked
        public static void printAll3(List<Integer> nums, int size) throws ArrayIndexOutOfBoundsException {
            for (int i = 0; i < size; i++) {
                System.out.println(nums.get(i));
            }
        }








    }
}
