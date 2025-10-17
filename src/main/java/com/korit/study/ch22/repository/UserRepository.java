package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.Arrays;
import java.util.Objects;

public class UserRepository {

    private static UserRepository instance;
    private User[] users;
    private int autoIncrementId = 1;

    private UserRepository() {
        users = new User[0];
        autoIncrementId = 1;     //Id 자동증가, 초기값 : 1
    }

    public static UserRepository getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepository();
        }
        return instance;
    }

    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);   //기존 +1 크기 배열에 users 복제
        user.setId(autoIncrementId++);  //생성할 때 id 부여되도록, 초기값이 1이므로 후증가
        temp[temp.length - 1] = user;
        users = temp;
    }

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
}
