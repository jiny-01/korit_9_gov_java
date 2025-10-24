package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardMain {
    public static void main(String[] args) {
        //게시판
//        """
//                큰 리스트[] - title(String), content(String), comments(List형태)\s
//                게시판 저자 writer - name, age 키 담는 map<String, Object>
//                게시판 댓글 comments - 큰 List 안에\s
//                comment detail - writer. content 담는 map <Stinrg, string>
//        """


        //최종 리스트
        List<Map<String, Object>> boardList = new ArrayList<>();

        //게시글 1
        Map<String, Object> board1 = new HashMap<>();
        board1.put("title", "게시판 제목1");
        board1.put("content", "게시판 내용1");

//        board1.put("title", "게시판 제목1");
//        board1.put("content", "게시판 내용1");
        //작은 것부터 만들기
        Map<String, Object> writer1 = new HashMap<>();
        writer1.put("name", "김준일");
        writer1.put("age", 32);
        board1.put("writer", writer1);
//        System.out.println(writer1);
//        writer1.put("writer", writer1);

        List<Map<String, String>> comments1 = new ArrayList<>();
        Map<String, String> comment1_1 = new HashMap<>();
        comment1_1.put("writer", "김준이");
        comment1_1.put("content", "댓글 내용1");
        comments1.add(comment1_1);

        Map<String, String> comment1_2 = new HashMap<>();
        comment1_2.put("writer", "김준삼");
        comment1_2.put("content", "댓글 내용2");
        comments1.add(comment1_2);

        board1.put("comments", comments1);
        boardList.add(board1);
//        System.out.println(boardList);


        //게시글 2
        Map<String, Object> board2 = new HashMap<>();
        board2.put("title", "게시판 제목2");
        board2.put("content", "게시판 내용2");

        //작은 것부터 만들기
        Map<String, Object> writer2 = new HashMap<>();
        writer2.put("name", "김준사");
        writer2.put("age", 34);
//        System.out.println(writer2);
        board2.put("writer", writer2);

        List<Map<String, String>> comments2 = new ArrayList<>();
        Map<String, String> comment2_1 = new HashMap<>();
        comment2_1.put("writer", "김준오");
        comment2_1.put("content", "댓글 내용11");
//        System.out.println(comment2_1);


        Map<String, String> comment2_2 = new HashMap<>();
        comment2_2.put("writer", "김준육");
        comment2_2.put("content", "댓글 내용22");
//        System.out.println(comment2_2);

        board2.put("comments", comments2);
        boardList.add(board2);

        System.out.println(boardList);

        //클래스 객체로 변환
        Board board = new Board();  //listboard 생성
        System.out.println(board);

        // 객체에 값 넣기??????
        //전체 board 정보 객체
//        List<Board> boards = new ArrayList<>();
//        for (Map<String, Object> boardMap : boardList) {              //boardMap - Map<String, Object>, 게시글 하나
//            Board listBoard1 = new Board();
//            listBoard1.setTitle((String) boardMap.get("title"));
//            listBoard1.setContent((String) boardMap.get("content"));
//            boards.add(listBoard1);
//            //
//
//            //writer map -> writer 객체
//            Map<String, Object> writerMap = (Map<String, Object>) boardMap.get("writer");
//            Writer writer = new Writer();
//            writer.setName((String) writerMap.get("name"));
//            writer.setAge((Integer) writerMap.get("age"));
////            writerMap.put("name", "김준일");
////            writerMap.put("age", 32);
//            listBoard1.setWriter(writer);
////        for (Map<String, Object> writer : writerMap) {
////            Writer writers = new Writer();
////            writerMap.put("name", "김준일");
////            writerMap.put("age", 32);
////        }
////        System.out.println(writerMap);
//
//            //comments 객체
//            List<Map<String, String>> commentsMapList = (List<Map<String, String>>) boardMap.get("comments");
//            List<Comment> commentList = new ArrayList<>();
//            for (Map<String, String> commentsMap : commentsMapList) {
//                Comment comment = new Comment();
//                comment.setWriter((String) commentsMap.get("writer"));
//                comment.setContent((String) commentsMap.get("content"));
//                commentList.add(comment);
//            }
//            listBoard1.setComments(commentList);
//
//        }
//        System.out.println("결과: " + boards);


        /**
         * [  -> new ArrayList<HashMap<String, Object>> ()
         *      {        -> new HashMap<String, Object>()
         *          "title": "게시판 제목1",
         *          "writer": {          -> new HashMap<String, Objcet>()
         *              "name": "김준일",
         *              "age": 32
         *          },
         *          "content": "게시판 내용1",
         *          "comments": [             -> new ArrayList<HashMap<String, String>>()
         *              {                     -> new <HashMap<String, String>()
         *                  "writer": "김준이",
         *                  "content": "댓글 내용1"
         *              },
         *              {
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },
         *      {    -> new HashMap<String, Object>()
         *          "title": "게시판 제목2",
         *          "writer": {             -> new HashMap<String, Object>
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [           -> new ArrayList<HashMap<String, String>>()
         *              {
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {                             -> New HashMap<String, String>()
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */














//        List<String> boardList = new ArrayList<>();
//        Map<String, Object> element = new HashMap<>();

        /**
         * [
         *      {
         *          "title": "게시판 제목1",
         *          "writer": {
         *              "name": "김준일",
         *              "age": 32
         *          },
         *          "content": "게시판 내용1",
         *          "comments": [
         *              {
         *                  "writer": "김준이",
         *                  "content": "댓글 내용1"
         *              },
         *              {
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },
         *      {
         *          "title": "게시판 제목2",
         *          "writer": {
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [
         *              {
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */

    }
}
