package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

public class SignupService {

    // 싱글톤 만들기 위한 조건
    // 1. instance static 변수 정의
    private static SignupService instance;   //static 변수는 instance 로 통일
    private UserRepository userRepository;

    //외부에서 생성 못하도록 private - 이 클래스 내에서만 생성자 호출가능
    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //static 이므로 외부 접근 가능하려면 getter 필요
    public static SignupService getInstance() {
        if (Objects.isNull(instance)) {            //호출 시 최초 한번만 null 인지 확인하고 생성
            instance = new SignupService(UserRepository.getInstance());
        }
        return instance;
    }

    //인스턴스 안에서 호출될 메서드 정의
    //유저네임 유효성검사
    public boolean isValidDuplicatedUsername(String username) {   //유효한지 여부 - 정상 - 중복 없음
        User foundUser = userRepository.findByUsername(username);
        if (Objects.isNull(foundUser)) {   //중복되는 거 없으면
            return true;    //중복되지 않음 -> true
        }
        return false;
    }

    public boolean isValidPassword(String password) {
        return Objects.isNull(password) && !password.isBlank();  //공백 제거했을 때 공백 = 입력값 없음
    }
    //String 은 null 가능이므로 Objects 차원에서 null safe 확인해야함
    //isEmpty : 공백 포함해도 공백으로 인식 안함 -> 무조건 trim() 같이 써야함
    //isBlank => trim().isEmpty

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (Objects.isNull(password) || Objects.isNull(confirmPassword)) {
            return false;
        }
        return password.equals(confirmPassword);
    }

    public void signup(SignupDto signupDto) {
        User newUser = new User(0, signupDto.getUsername(), PasswordEncoder.encode(signupDto.getPassword()));
        userRepository.insert(signupDto.toUser());
    }





}
