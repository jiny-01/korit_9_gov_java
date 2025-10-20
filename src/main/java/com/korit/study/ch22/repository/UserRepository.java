package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.Arrays;
import java.util.Objects;

public class UserRepository {

    private static UserRepository instance;  //UserRepository 는 하나의 객체만 존재 -static 변수
    private User[] users;  // User 객체를 저장할 배열 - DB 역할
    private int autoIncrementId = 1;

    private UserRepository() {
        users = new User[0];
        autoIncrementId = 1;     //Id 자동증가, 초기값 : 1
    }

    // User 객체를 가져오는 유일한 방법 = getInstance
    public static UserRepository getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepository();
        }
        return instance;
    }

    // insert - 새 사용자 users 배열에 추가
    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);   //기존 +1 크기 배열에 users 복제
        user.setId(autoIncrementId++);  //생성할 때 id 부여되도록, 초기값이 1이므로 후증가
        temp[temp.length - 1] = user;
        users = temp;
    }

    // findByUsername : 입력된 username과 일치하는 사용자가 있는지
    //찾으면 해당 User 객체를 반환하고, 못 찾으면 null을 반환
    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

//    private int generateId() {
//        return users[users.length].getId() + 1;
//
//    }
    //이거 대신 autoIncrementId 사용

    //users 배열에 있는 모든 사용자 정보를 보기 좋은 문자열로 만들어 반환
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();  // stringBuilder 라는 객체 생성 -> 버퍼란 공간 생김
        stringBuilder.append("User 배열: [ ");
        for (int i = 0; i < users.length; i++) {
            stringBuilder.append(users[i]);
            if (i != users.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}
