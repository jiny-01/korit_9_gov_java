package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.repository.UserRepositoryImpl2;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

//UserRepository와 마찬가지로 싱글톤 패턴
public class SignupService {

    // 싱글톤 만들기 위한 조건
    // 1. instance static 변수 정의
    private static SignupService instance;
    //static 변수는 instance 로 통일
    //static 변수를 하나 정의함 - 다른 클래스 어디서든 메모리 참조, 접근 가능함 - 공유되어지는 변수 -> 변수명 instance 로 정의한 것일 뿐
    // 자료형 : SignupService
    //instance 에는 SignupService(자료형) 으로 생성된 값만 가능
    // private : 다른 패키지에서 접근 불가능
    private UserRepository userRepository;   //생성 시 UserRepository 객체 의존성 주입
    //이 클래스(즉, 이 파일) 에서 UserRepository 를 userRepository 라는 변수명으로 쓰겠다고 선언

    //외부에서 생성 못하도록 private - 이 클래스 내에서만 생성자 호출가능
    private SignupService(UserRepositoryImpl2 userRepository) {
        this.userRepository = userRepository;
    }

    //static 이므로 외부 접근 가능하려면 getter 필요
    // 다른 곳에서 호출해서 쓸 수 있도록 SignupService 객체를 리턴하는
    // getInstance() 정의한 것
    public static SignupService getInstance() {
        if (Objects.isNull(instance)) {              //호출 시 최초 한번만 null 인지 확인하고 생성
            instance = new SignupService(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    //인스턴스 안에서 호출될 메서드 정의
    //유저네임 유효성검사
    public boolean isValidDuplicatedUsername(String username) {   //유효한지 여부 - 정상 - 중복 없음
        User foundUser = userRepository.findByUsername(username); //저장된 User 객체에서 username 으로 사용자 찾기
        if (Objects.isNull(foundUser)) {      //중복되는 거 없으면 = 사용자 못 찾았으면
            return true;    //중복되지 않음 -> 중복검사 통과 => true
        }
        return false;
    }

    //비밀번호가 null이 아니고, 공백 문자로만 이루어져 있지도 않은지
    public boolean isValidPassword(String password) {
        return !Objects.isNull(password) && !password.isBlank();  //공백 제거했을 때 공백 = 입력값 없음
    }
    //String 은 null 가능이므로 Objects 차원에서 null safe 확인해야함
    //isEmpty : 공백 포함해도 공백으로 인식 안함 -> 무조건 trim() 같이 써야함
    //isBlank => trim().isEmpty

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (Objects.isNull(password) || Objects.isNull(confirmPassword)) {
            return false;
        }
        return password.equals(confirmPassword);  //두 비밀번호가 일치하는지 확인
    }

    //DTO를 User 객체로 변환(이때 암호화 발생)한 뒤, UserRepository에 저장(insert)을 요청
    public void signup(SignupDto signupDto) {
        User newUser = new User(0, signupDto.getUsername(), PasswordEncoder.encode(signupDto.getPassword()));
        userRepository.insert(signupDto.toUser());
    }





}
