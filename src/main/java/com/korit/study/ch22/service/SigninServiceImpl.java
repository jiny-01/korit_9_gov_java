package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SigninDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.repository.UserRepositoryImpl;
import com.korit.study.ch22.repository.UserRepositoryImpl2;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

//로그인 비즈니스 로직
public class SigninServiceImpl implements SigninService{
    //싱글톤으로 만들 것
    private static SigninServiceImpl instance;
    private UserRepository userRepository;

    private SigninServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SigninServiceImpl getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SigninServiceImpl(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }


    // 비밀번호 일치 확인
    //비밀번호가 일치하지 않으면 함수 탈출 (사용자 정보를 다시 확인하세요.)


    // 로그인 성공 -> 로그인 성공한 User 객체 toString 으로 출력


    @Override
    public void signin(SigninDto signinDto) {
        // 로그인을 시도한 사용자이름 확인 userRepository에서
        // 해당 사용자 이름을 가진 User객체가 있는지 확인
        // 객체가 null이면 함수 탈출(사용자 정보를 다시 확인하세요.)

        User foundUser = userRepository.findByUsername(signinDto.getUsername()); //UserRepository에서 해당 아이디의 사용자
        if (Objects.isNull(foundUser)) {
            System.out.println("사용자 정보를 다시 확인하세요.");
            return;
        }

        // 비밀번호 일치 확인
        // 비밀번호가 일치하지 않으면 함수 탈출(사용자 정보를 다시 확인하세요.)

        // 로그인 성공 -> 로그인 성공한 User객체 toString으로 출력

        // PasswordEncoder를 이용해 사용자가 입력한 평문 비밀번호(signinDto.getPassword())와
        // DB에 저장된 암호문(foundUser.getPassword())을 비교
        // 여기서 signinDto.getPassword 랑 signupDto.getPassword 바로 비교할 수 없는 이유
        // signinDto.getPassword()`: 사용자가 방금 입력한 평문 비밀번호 ("1234")
        // foundUser.getPassword()`: 회원가입 때 DB에 저장해둔 암호화된 비밀번호 ("abcdef")
        if (!PasswordEncoder.match(signinDto.getPassword(), foundUser.getPassword())) {
            System.out.println("사용자 정보를 다시 확인하세요.");
            return;
        }

        System.out.println("로그인 성공");
        System.out.println(foundUser);
    }

    @Override
    public boolean isEmpty(String str) {
        if (Objects.isNull(str)) {
            return false;
        }
        return str.isBlank();
        //username, password 가 각각 공백이 아닌지 확인용도
    }
    //str이 null이거나, 공백 문자로만 이루어져 있으면 true(비어있음)를 반환
}
