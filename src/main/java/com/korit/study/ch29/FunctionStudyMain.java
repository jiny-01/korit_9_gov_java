package com.korit.study.ch29;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

//UserDto -> Function : Map 으로 전달
//Function 에서 비밀번호 암호화 => Map2
//Map2 -> UserEntity

//클래스 - UserDto
class UserDto {
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}


//클래스 선언 - UserEntity
class UserEntity {
    private String username;
    private String encodedPassword;

    public UserEntity(String username, String encodedPassword) {
        this.username = username;
        this.encodedPassword = encodedPassword;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", encodedPassword='" + encodedPassword + '\'' +
                '}';
    }
}


public class FunctionStudyMain {
    public static void main(String[] args) {
        // Function - PasswordEncoding
        //2단계: passwordEncoding
        //compose()로 만든 Map이
        //바로 passwordEncoding 함수의 입력으로 들어감
        // Map 안에 password 를 Objects.hash(data.get("password")) * 10 실행해서 암호화된 비밀번호로 바꿈
        Function<Map<String, Object>, Map<String, Object>> passwordEncoding = data -> {
            data.replace("password", Objects.hash(data.get("password")) * 10);
            return data;
        };

        // userMap 으로 변환 - 이때 비밀번호는 암호화된 비밀번호
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("username", "test1234");
        userMap.put("password", "1234");
        System.out.println("before: " + userMap);
        passwordEncoding.apply(userMap);
        Map<String, Object> passwordEncodeUserMap = passwordEncoding.apply(userMap);
        System.out.println("after: " + userMap);


        // 최종 결과물 - UserEntity
        //3) Map2 를 매개변수로 받아옴 - Function 인 passwordEncoding 수행
        //비밀번호 부분 암호화해서 암호화된 비밀번호 넣은 Map  => 최종 Map 생성 (암호화된 비밀번호가 들어간)
        UserEntity userEntity = passwordEncoding
                //2) compose 에서 Map 으로 변환 - Dto 에서 username, password get 해서 Map 에 put => 결과물 Map2
                // 1단계 - compose()는 전처리 함수.
                //=> apply()로 받은 UserDto를 먼저 처리해서 Map으로 바꿈
                .compose(userDto -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("username", ((UserDto)userDto).getUsername());   //하한 경계이므로 (UserDto) 명시
                    map.put("password", ((UserDto)userDto).getPassword());
                    return map;
                //4) Function 에서 받아온 최종 Map 을 UserEntity 객체로 최종 변환
                //3단계 -
                //andThen()은 후처리 함수
                //암호화된 Map을 받아 UserEntity 객체로 변환
                }).andThen(map -> {
                    return new UserEntity(map.get("username").toString(), map.get("password").toString());
                })
                //4단계: .apply(new UserDto("aaa", "1234"))
                //최종적으로 입력(UserDto) 하나만 넣으면,
                //compose → passwordEncoding → andThen
                //순서대로 실행되어
                //최종 UserEntity가 나옴.
                .apply(new UserDto("aaa", "1234"));  // 1) 가장 처음 원시 자료 - UserDto
    }
}
