package com.korit.study.ch31;

import java.util.Map;

class CustomException extends RuntimeException {

    private Map<String, String> error;

    public CustomException(String message, Map<String, String> error) {
        super(message);
        this.error = error;
    }

    public Map<String, String> getError() {
        return error;
    }
}

//예외 강제 발생
// 강제 제외 생성
public class ExceptionMain3 {
    public static void main(String[] args) {
        NullPointerException nullPointerException = new NullPointerException("예외 발생");
        System.out.println(nullPointerException);
        System.out.println(nullPointerException.getMessage());

        try {
            throw nullPointerException;
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("NULL 처리하세요.");
        }

        try {
            throw new CustomException("내가 만든 예외", Map.of("errorId", "1", "message", "내가 만든 오류내용"));
        } catch (CustomException e) {
            System.out.println(e.getError());
        }
        System.out.println("프로그램 정상 종료");






    }
}
