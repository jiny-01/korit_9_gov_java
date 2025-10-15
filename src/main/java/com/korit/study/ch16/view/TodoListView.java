package com.korit.study.ch16.view;

import com.korit.study.ch16.dto.SigninDto;
import com.korit.study.ch16.dto.SignupDto;
import com.korit.study.ch16.dto.TodoRegisterDto;
import com.korit.study.ch16.entity.User;
import com.korit.study.ch16.service.TodoService;
import com.korit.study.ch16.service.UserService;

import java.util.Scanner;

public class TodoListView {

    private Scanner scanner;             //Scanner 계속 쓸 것이므로 생성자로 정의
    private User principal;              // 유저 객체 - 기본값 null
    private UserService userService;
    private TodoService todoService;

    //생성자 호출될 때 만들어줌
    public TodoListView(UserService userService, TodoService todoService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
        this.todoService = todoService;
    }


    public void homeView() {
        while(true) {
            System.out.println("[ TodoList ]");
            System.out.println("1. TodoList");
            if (principal == null) {                  // 유저 객체 없으면
                System.out.println("2. 회원가입");

                System.out.println("3. 로그인");
            } else {                                  // 유저 객체 있으면
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(">> ");                  //입력받을 때 같은 라인에 입력받기 위함
            String cmd = scanner.nextLine();
            //CMD = 객체 = 문자열 = " "

            //클린 코딩 개념
            //String cmd = null; 일 때
            //cmd.equals("q") : cmd 가 null 로 초기화되어있기 때문에 equals 호출 자체가 안됨
            //("q").equals(cmd) : q 는 null 이 아니기 때문에 이건 가능

            if ("q".equals(cmd)) {
                break;
            } else if("1".equals(cmd)) {
                //TodoList 관리
                if (principal == null) {
                    System.out.println("로그인 후 사용가능합니다.");
                    continue;
                }
                todoListMenuView();
            } else if ("2".equals(cmd) && principal == null) {
                //회원가입
                signupView();
            } else if ("2".equals(cmd) && principal != null) {
                //로그아웃
                principal = null;
                System.out.println("==<< 로그아웃 완료!! >> ==");
            } else if ("3".equals(cmd) && principal == null) {
                //null 아니어도 3번 입력가능하기 때문에 조건에 null 일때만 실행되도록
                //로그인
                signinView();
            }


        }
    }



    public void loginView() {

    }



    //로그인 뷰
    void signinView() {
        System.out.println("[로그인]");
        System.out.print("username >> ");
        String username = scanner.nextLine();
        System.out.print("password >> ");
        String password = scanner.nextLine();
        SigninDto signinDto = new SigninDto(username, password);
        User foundUser = userService.signin(signinDto);
        if (foundUser == null) {                               //아이디 / 패스워드 중 하나 틀린 경우
            System.out.println("사용자 정보를 다시 확인하세요.");
            return;                                            //void 일 때 return 쓰면 바로 함수 종료
        }
        principal = foundUser;
        System.out.println("==<< 로그인 성공!! >> ==");

    }

    //회원가입 뷰
    void signupView() {
        System.out.println("[ 회원가입 ]");
        String username = null;
        while (true) {
            System.out.print("username >>");
            username = scanner.nextLine();
            if (!userService.isDuplicatedUsername(username)) {
                break;
            }
            System.out.println("이미 존재하는 사용자이름입니다.");
        }
        System.out.print("password >>");
        String password = scanner.nextLine();
        System.out.println("name >> ");
        String name = scanner.nextLine();
        SignupDto signupDto = new SignupDto(username, password, name);   //여기에 값 넣어서 출력
        System.out.println(signupDto.toString());
        userService.signup(signupDto);
        System.out.println("==<< 회원가입 완료!! >> ==");
        userService.printUserListAll();
    }

    void todoListMenuView() {
        while (true) {             //무한 반복 걸 경우 무조건 break 필요 (if문과 세트)
            System.out.println("[ TodoList Menu ]");
            System.out.println("1. Todo 등록");
            System.out.println("2. Todo 조회");
            System.out.println("b. 뒤로 가기");
            System.out.print(">> ");
            String cmd = scanner.nextLine();

            if ("b".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                System.out.println("[ Todo 등록 ]");
                System.out.println("오늘 할 일 >> ");
                String contents = scanner.nextLine();
                TodoRegisterDto todoRegisterDto = new TodoRegisterDto(contents, principal);
                todoService.register(todoRegisterDto);
                System.out.println("==<< Todo 등록완료 >>==");
            } else if ("2".equals(cmd)) {
                System.out.println("[ Todo 조회 ]");
                todoService.printAllByUserId(principal);

            }
        }
    }
}
