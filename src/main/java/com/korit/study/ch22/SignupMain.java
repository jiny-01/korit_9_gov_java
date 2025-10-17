package com.korit.study.ch22;

import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.service.SignupService;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Scanner;

public class SignupMain {
    public static void main(String[] args) {
        SignupService signupService = SignupService.getInstance();
        //private 로 생성자 제한해뒀으므로 객체 생성 불가
        //static 의 성질을 이용해서 getInstance 로 가져옴
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[회원가입, 로그인]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.println("선택 >> ");
            String selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료 중...");
                break;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("[ 회원가입 ]");
                SignupDto signupDto = new SignupDto();
                //변수로 다 받고 AllArgu 하면 다른 곳에서 그 변수를 사용할 수 없으므로 객체생성하는 방식이용
                while (true) {
                    System.out.print("사용자이름: ");
                    signupDto.setUsername(scanner.nextLine());
                    if (signupService.isValidDuplicatedUsername(signupDto.getUsername())) {
                        break;
                    }
                    System.out.println("이미 사용중인 사용자이름입니다.");
                }
                while (true) {
                    System.out.print("비밀번호: ");
                    signupDto.setPassword(scanner.nextLine());
                    if (signupService.isValidPassword(signupDto.getPassword())) {
                        break;
                    }
                    System.out.println("비밀번호는 공백일 수 없습니다. 다시 입력하세요.");
                }
                while (true) {
                    System.out.print("비밀번호확인: ");
                    signupDto.setConfirmPassword(scanner.nextLine());
                    if (signupService.isValidConfirmPassword(signupDto.getPassword(), signupDto.getConfirmPassword())) {
                        break;
                    }
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
                }

                signupService.signup(signupDto);
                System.out.println("<< 회원가입 완료 >>");

            } else if ("2".equals(selectedMenu)) {
                System.out.println("[ 로그인 ]");
                System.out.print("사용자이름: ");
                System.out.print("비밀번호: ");
            } else if ("3".equals(selectedMenu)) {
                System.out.println("[ 가입된 회원 전체 조회 ]");
                System.out.println(UserRepository.getInstance().toString());
            }
        }

        System.out.println("프로그램 종료 완료");




    }

}
