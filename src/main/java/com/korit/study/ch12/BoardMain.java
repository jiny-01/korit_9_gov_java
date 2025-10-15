package com.korit.study.ch12;

public class BoardMain {
    public static void main(String[] args) {

        // Board 배열 - boards -> 게시글 2개

        // Board - id(정수), title(문자열), contents(문자열), writer(Writer), comments(Comment[])

        // Writer - id(정수), name(문자열),

        //Comment - id(정수), contents(문자열), writer(Writer),

        /*
        * 1. Board 배열 2개의 공간 생성
        * 2. Writer 3명 생성
        * 3. Comment 4개 생성
        * 4. Board 2개 생성 -> 게시글 작성자와 댓글 작성자는 원하는 작성자 주입*/

        // Writer 3명 생성
        Writer[] writers = new Writer[3];
        writers[0] = new Writer(1, "유저1");
        writers[1] = new Writer(2, "유저2");
        writers[2] = new Writer(3, "유저3");



        // Comment 4개 생성
        Comment[][] comments = new Comment[2][];   //comments 배열을 묶는 배열
        //공간 만들어주기
        comments[0] = new Comment[3];
        comments[1] = new Comment[3];

        comments[0][0] = new Comment(1, "게시글 1의 첫 번째 댓글", writers[0]);
        comments[0][1] = new Comment(2, "게시글 1의 두 번째 댓글", writers[0]);
        comments[0][2] = new Comment(3, "게시글 1의 세 번째 댓글", writers[2]);
        comments[1][0] = new Comment(1, "게시글 2의 첫 번째 댓글", writers[1]);
        comments[1][1] = new Comment(2, "게시글 2의 두 번째 댓글", writers[0]);
        comments[1][2] = new Comment(3, "게시글 2의 세 번째 댓글", writers[2]);


//        Comment[] comments = new Comment[3];
//        comments[0] = new Comment(1, "첫 번째 댓글", writers[0]);
//        comments[1] = new Comment(2, "두 번째 댓글", writers[0]);
//        comments[2] = new Comment(3, "세 번째 댓글", writers[2]);


        // Board 2개 생성
//        Board[] boards = new Board[2];
        Board board1 = new Board(1, "게시물1", "테스트용 게시물1", writers[1], comments[0]);

        Board board2 = new Board(2, "게시물2", "테스트용 게시물2", writers[2], comments[0]);
        Board[] boards = new Board[] { board1, board2 };


        BoardPrintService boardPrintService = new BoardPrintService();
        boardPrintService.printBoardInfoAll(boards);

        // 출력 확인
        for (Board board : boards) {
            System.out.println("==== 게시물 ====");
            System.out.println("제목: " + board.title);
            System.out.println("내용: " + board.contents);
            System.out.println("작성자: " + board.writer.name);
            System.out.println("--- 댓글 ---");
            for (Comment comment : board.comments) {
                System.out.println(comment.writer.name + ": " + comment.contents);
            }
        }




    }
}
