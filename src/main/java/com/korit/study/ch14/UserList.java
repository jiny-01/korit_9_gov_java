package com.korit.study.ch14;

public class UserList {
    User[] users;                //참조할 주소가 없음 -> null 인 것

    UserList() {
        this.users = new User[0];

    }

    //유저아이디 생성 - 초기값 1
    int generateUserId() {
        int newId = 1;   //첫 번째 아이디로 1부여하고 시작
        if (users.length == 0) {
            return newId;
        }
        return users[users.length - 1].id + 1;   //유저 배열에서 제일 마지막 유저 객체 +1 해서 새 아이디 발급
    }

    void add(User user) {
        User[] temp = new User[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            temp[i] = users[i];
        }
        temp[temp.length - 1] = user;
        users = temp;
    }

    User findByUsername(String username) {
        for (User user : users) {
            if(user.username.equals(username)) {
                return user;
            }
        }
        return null;                                 //반복 다 돌았는데 못 찾았으면 못 찾은 거
    }


}
