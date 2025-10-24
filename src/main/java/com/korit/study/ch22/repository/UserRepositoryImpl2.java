package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepositoryImpl2 implements UserRepository{

    private static UserRepositoryImpl2 instance;  //UserRepository 는 하나의 객체만 존재 -static 변수
    //싱글톤이므로 instance 변수로 만듦
    //어디서든 참조 가능해야 하기 떄문에 static
    //다른 곳에서 접근하지 못하도록 private - 한 클래스 내 변수는 전부 private
//    private User[] users;  // User 객체를 저장할 배열 - DB 역할
    //** ArrayList 변환
//    private List<User> users;
    List<User> users = new ArrayList<>();
    private int autoIncrementId = 1;


    //생성자 호출 시 다른 곳에서 생성 못하도록 private
    private UserRepositoryImpl2() {
//        users = new User[0];
        users = new ArrayList<>();
        autoIncrementId = 1;     //Id 자동증가, 초기값 : 1
    }

    // User 객체를 가져오는 유일한 방법 = getInstance
    public static UserRepositoryImpl2 getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepositoryImpl2();
        }
        return instance;
    }

//    // insert - 새 사용자 users 배열에 추가
//    public void insert(User user) {
//        User[] temp = Arrays.copyOf(users, users.length + 1);   //기존 +1 크기 배열에 users 복제
//        user.setId(autoIncrementId++);  //생성할 때 id 부여되도록, 초기값이 1이므로 후증가
//        temp[temp.length - 1] = user;
//        users = temp;-
//    }

    //**ArrayList 변환
    public void insert(User user) {
        user.setId(autoIncrementId++);
        users.add(user);
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
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();  // stringBuilder 라는 객체 생성 -> 버퍼란 공간 생김
//        stringBuilder.append("User 배열: [ ");
//        for (int i = 0; i < users.length; i++) {
//            stringBuilder.append(users[i]);
//            if (i != users.length - 1) {
//                stringBuilder.append(", ");
//            }
//        }
//        stringBuilder.append(" ]");
//        return stringBuilder.toString();
//    }

    //**ArrayList 변환
    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("User 배열: [");
        for (int i = 0; i < users.size(); i++) {
            sb2.append(users.get(i));
            if (i != users.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(" ]");
        return sb2.toString();
    }
}
