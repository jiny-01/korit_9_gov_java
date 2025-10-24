package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.List;

public class BoardMain2 {
    public static void main(String[] args) {
        //#1) 빈 리스트부터 만들어서 시작
        List<Board> boards = new ArrayList<>();
        //가장 큰 보드 - 게시물1, 게시물2
        boards.add(new Board());  // 빈 객체 1 - 게시물1
        // TItle - String
        boards.get(0).setTitle("게시판 제목1");
        //Writer 객체
        boards.get(0).setWriter(new Writer("김준일", 32));    //Writer 객체로 받아옴 동시에 객체 생성해서 대입가능
        // Content - String
        boards.get(0).setContent("게시판 내용1");
        //댓글 리스트
        boards.get(0).setComments(new ArrayList<>());
        boards.get(0).getComments().add(new Comment(new Writer("김준이", 31), "댓글 내용1"));
        boards.get(0).getComments().add(new Comment(new Writer("김준삼", 31), "댓글 내용2"));

        //#2) 깡통말고 Board 객체 만들기
        //각각 객체 생성해서 바로 set 해줌
        Board board = new Board();
        //Title - 바로 setTitle
        board.setTitle("게시판 제목1");
        //Writer - Writer 객체 만들어서 set
        board.setWriter(new Writer("김준사", 34));
        //Content - 바로 setContent
        board.setContent("게시판 제목1");
        //Comment - Comment 객체 만들어서 set,
        // 이때 Comment 안에 Writer 객체 만들어서 추가, comment 의 content
        // 바로 board 의 setComments 에 comments 객체 넣어줌
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(new Writer("김준오", 35), "댓글 내용1"));  //get 안 써도 됨
        comments.add(new Comment(new Writer("김준육", 36), "댓글 내용2"));
        board.setComments(comments);
        boards.add(board);

        boards.add(new Board());  // 빈 객체 2 - 게시물2
        System.out.println(boards);

        //게시물2
        //복붙해서 2 로 바꿔줌
        //AllArgu 써서 바로 넣어줌 - Comments 먼저 한 것
        List<Comment> comments2 = new ArrayList<>();
        comments2.add(new Comment(new Writer("김준오", 35), "댓글 내용1"));  //get 안 써도 됨
        comments2.add(new Comment(new Writer("김준육", 36), "댓글 내용2"));
        Board board2 = new Board("게시판 제목2", new Writer("김준사", 34), "게시판 내용2", comments2);

        boards.add(board2);

        /// ///////////전체 출력
        System.out.println("최종 리스트: " + boards);

    }
}
