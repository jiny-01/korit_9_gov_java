package com.korit.study.ch16.service;

import com.korit.study.ch16.repository.UserList;
import com.korit.study.ch16.dto.SigninDto;
import com.korit.study.ch16.dto.SignupDto;
import com.korit.study.ch16.entity.User;

public class UserService {

    UserList userList;


    public UserService(UserList userList) {
        this.userList = userList;
    }

    //유저네임 중복확인
    public boolean isDuplicatedUsername(String username) {
        return userList.findByUsername(username) != null;   //null 아니어야 중복있단 의미
    }


    //로그인
    public User signin(SigninDto signinDto) {
        User foundUser = userList.findByUsername(signinDto.getUsername());
        if (foundUser == null) {                         //아이디 존재하지 않을 때
            // 사용자이름(아이디) 가 존재하지 않는다.
            return null;
        }
        if (!foundUser.getPassword().equals(signinDto.getPassword())) {    //비밀번호 일치하지 않을 때
            return null;
        }
        return foundUser;
    }


    //회원가입
    public void signup(SignupDto signupDto) {
        User user = signupDto.toUser();        // toUser 메소드 - 유저 객체 리턴
        user.setId(userList.generateUserId());   // userList 에서 새로 발급된 ID 배열
        userList.add(user);    //배열에 user 추가
    }

    //등록된 유저 배열로 조회 - for-each 로 출력
    public void printUserListAll() {
        System.out.println("등록된 사용자 전체 조회");
        for (User user : userList.findAll()) {
            System.out.println(user.toString());
        }
    }


}
