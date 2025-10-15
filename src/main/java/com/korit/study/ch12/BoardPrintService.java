package com.korit.study.ch12;

public class BoardPrintService {

    // 게시물 전체 출력
    void printBoardInfoAll(Board[] boards) {
//      #1) 방법1
        for (int i = 0; i < boards.length; i++) {
            Board board = boards[i];
            System.out.println("게시글 ID: " + board.id);
            System.out.println("게시글 제목: " + board.title);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);

//            System.out.println("게시글 댓글 ID: " + board.comments[0].id);  //이렇게 할 수 없으니
            //comment 도 반복 이용
            for (int j = 0; j < board.comments.length; j++) {
                Comment comment = board.comments[j];
                System.out.println("댓글 ID: " + comment.id);
                System.out.println("댓글 내용: " + comment.contents);
                System.out.println("댓글 작성자 ID: " + comment.writer.id);
                System.out.println("댓글 작성자 이름: " + comment.writer.name);
            }
            System.out.println();
//            System.out.println("==== [" + (i + 1) + "]번째 게시물 ====");
//            printBoardInfo(boards[i]);
        }
//      #2) 방법2 - 인덱스 필요없는 경우에는 for-each 반복
        for (Board board : boards) {
            System.out.println("게시글 ID: " + board.id);
            System.out.println("게시글 제목: " + board.title);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);
//==================================================================================================
//          System.out.println("게시글 댓글 ID: " + board.comments[0].id);  //이렇게 할 수 없으니
            //comment 도 반복 이용
            for (Comment comment : board.comments) {
                System.out.println("댓글 ID: " + comment.id);
                System.out.println("댓글 내용: " + comment.contents);
                System.out.println("댓글 작성자 ID: " + comment.writer.id);
                System.out.println("댓글 작성자 이름: " + comment.writer.name);
            }
            System.out.println();
            }

        }
    }

    // 게시물 하나 출력
//    void printBoardInfo(Board board) {
//        System.out.println("게시물 번호: " + board.id);
//        System.out.println("제목: " + board.title);
//        System.out.println("내용: " + board.contents);
//        printWriterInfo(board.writer);
//        printCommentDetail(board.comments);
//    }
//
//    //작성자
//    void printWriterInfo(Writer writer) {
//        System.out.println("[작성자 정보]");
//        System.out.println(writer.id);
//        System.out.println(writer.name);
//    }
//
//    //
//    void printCommentDetail(Comment[] comments) {
//        System.out.println("[댓글 상세 내용]");
//        for (Comment comment : comments) {
//            printCommentInfo(comment);
//        }
//
//    }
//
//    void printCommentInfo(Comment comments) {
//        System.out.println("[댓글 정보]");
//        System.out.println("댓글 번호: " + comments.id);
//        System.out.println("댓글 내용: " + comments.contents);
//        System.out.println("댓글 작성자: " + comments.writer);
//    }










