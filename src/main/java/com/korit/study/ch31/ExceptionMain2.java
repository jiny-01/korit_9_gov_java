package com.korit.study.ch31;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {
        List<String> names = List.of("김준일", "김준이");
        try {
            print(null, 2);       //null 에러 발생시킴
            print(names, 2);       //OK
            print(names, 3);       //IO 에러 있으므로 무조건 에러처리
        } catch (IOException e) {       //IO 는 무조건 필수

        } catch (NullPointerException e) {
            System.out.println("리스트 변수에 null 이 들어가있어");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("배열 크기 넘었어");
        } catch (Exception e) {                            //모든 예외 중 무조건 최상위 Exception 처리하므로 finally 위 (즉, 가장 마지막에 처리)
            System.out.println("최종적으로 모든 예외 처리");
        } finally {
            System.out.println("프로그램 정상 종료");
        }



        //throws 에러 해줌 -> 예외가 터진 곳, 호출한 곳에서 try-catch 로 예외처리
        // => throws 로 예외처리 강제화
    }

    public static void print(List<String> names, int size) throws
            IOException,
            NullPointerException,
            IndexOutOfBoundsException {
        System.out.println(names.size());
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
        }

//        File f = new File("");  //IO Exception 발생

    }
}
