package com.korit.study.ch22;

import com.korit.study.ch22.dto.SigninDto;
import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.service.SigninService;
import com.korit.study.ch22.service.SigninServiceImpl;
import com.korit.study.ch22.service.SignupService;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Scanner;

//프로그램의 시작점이자, 사용자의 입력을 받고 결과를 출력하는 "View" 역할 => 메인 실행 클래스
public class SignupMain {
    public static void main(String[] args) {
        //싱글톤으로 구현된 서비스 객체들을 가져옴
        SignupService signupService = SignupService.getInstance();
        SigninServiceImpl signinService = SigninServiceImpl.getInstance();
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
                SignupDto signupDto = new SignupDto();  //SignupDto 객체를 생성
                //변수로 다 받고 AllArgu 하면 다른 곳에서 그 변수를 사용할 수 없으므로 객체생성하는 방식이용
                while (true) {
                    System.out.print("사용자이름: ");
                    signupDto.setUsername(scanner.nextLine());
                    if (signupService.isValidDuplicatedUsername(signupDto.getUsername())) {  //중복검사 수행
                        break;
                    }
                    System.out.println("이미 사용중인 사용자이름입니다.");
                }
                while (true) {
                    System.out.print("비밀번호: ");
                    signupDto.setPassword(scanner.nextLine());
                    if (signupService.isValidPassword(signupDto.getPassword())) {   // 유효성 검사 수행
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

                signupService.signup(signupDto); // 유효성 검사 완료 시 signup 호출하여 회원가입 진행
                System.out.println("<< 회원가입 완료 >>");

            } else if ("2".equals(selectedMenu)) {
                System.out.println("[ 로그인 ]");
                System.out.print("사용자이름: ");
                System.out.print("비밀번호: ");

                // SigninDto 를 생성하여 로그인 정보 입력 받음 (공백확인)
                // 유효성 검사 완료 후 signin() 호출
                //사용자가 공백이 아닌 유효한 값을 입력해야만 루프를 빠져나와 (break)
                // 실제 로그인 로직을 실행할 수 있게 분기처리
                SigninDto signinDto = new SigninDto();  //SigninDto 객체를 생성
                while (true) {
                    System.out.print("사용자이름: ");
                    signinDto.setUsername(scanner.nextLine());
                    //비어있지 않을 때 break
                    if (!signinService.isEmpty(signinDto.getUsername())) {
                        break;
                    }
                    System.out.println("사용자 이름을 입력하세요.");
                }
                while (true) {
                    System.out.print("비밀번호: ");
                    signinDto.setPassword(scanner.nextLine());
                    if (!signinService.isEmpty(signinDto.getPassword())) {
                        break;
                    }
                    System.out.println("비밀번호를 입력하세요.");
                }
                signinService.signin(signinDto);



            } else if ("3".equals(selectedMenu)) {
                System.out.println("[ 가입된 회원 전체 조회 ]");
                System.out.println(UserRepository.getInstance().toString());
            }
        }

        System.out.println("프로그램 종료 완료");




    }

}
