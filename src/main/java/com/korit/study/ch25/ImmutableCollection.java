package com.korit.study.ch25;

import com.korit.study.ch24.Board;
import com.korit.study.ch24.Comment;
import com.korit.study.ch24.Writer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//불변 컬렉션
//값이 변하지 않는??
//한 번 만들어진 뒤에는 값이 절대 바뀌지 않는 컬렉션
//즉, 요소를 추가(add), 수정(set), 삭제(remove) 불가 - 읽기 전용

/*
* 상수처럼 변하지 않는 데이터”를 미리 정의할 때 (예: 메뉴 목록, 국가코드 등)
* 여러 스레드(thread)가 동시에 접근해도 안전해야 할 때
* 데이터가 한 번 정의되면 바뀌면 안 되는 비즈니스 로직
* */

public class ImmutableCollection {
    public static void main(String[] args) {
//        List<String> iList = new ArrayList<>();
        //List.of -  불변 리스트
        List<String> iList = List.of("김준일", "김준이");       // 리스트 복제할 때
//        iList.add("김준삼");   //-> 오류발생 - 불변이므로 add, set, remove 불가능 / get 만 가능 => 읽기 전용
        System.out.println(iList);

        //불변 맵 - 고정 값 데이터
        Map<String, List<String>> iMap = Map.of(
                "k1", List.of("김준일", "김준이"),
                "k2", List.of("김준삼", "김준사"),
                "k3", List.of("김준오", "김준육"),
                "k4", List.of("김준칠", "김준팔", "김준구")
        );

        List<Board> boards = new ArrayList<>();  //boards 리스트 - 가변
        //가변이므로 add 가능
        // but 안의 댓글- 불변이므로 new Board 로 게시글 생성 이후엔 댓글 추가 불가능
        boards.add(new Board(
                "제목1",
                new Writer("김준일", 32),
                "내용1",
                List.of(
                new Comment(new Writer("김준이", 32), "댓글1"),
                new Comment(new Writer("김준삼", 33), "댓글2")
        )));

        System.out.println("iList: " + iList);
        System.out.println("iMap: " + iMap);
        System.out.println(boards);

        //=> iList: [김준일, 김준이]
        //iMap: {k1=[김준일, 김준이], k2=[김준삼, 김준사], k3=[김준오, 김준육], k4=[김준칠, 김준팔, 김준구]}
        //boards:
        // [Board{title='제목1',
        // writer=Writer{name='김준일', age=32},
        // content='내용1',
        // comments=[Comment{writer=Writer{name='김준이', age=32}, content='댓글1'},
        // Comment{writer=Writer{name='김준삼', age=33}, content='댓글2'}]}]
    }

}
