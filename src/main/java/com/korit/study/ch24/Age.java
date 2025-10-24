//import java.util.*;
//
//public class BoardExample {
//    public static void main(String[] args) {
//
//        // 최종적으로 게시판 전체를 담을 리스트
//        List<Map<String, Object>> boardList = new ArrayList<>();
//
//        // 게시글 1 ---------------------------
//        Map<String, Object> board1 = new HashMap<>();
//        board1.put("title", "게시판 제목1");
//        board1.put("content", "게시판 내용1");
//
//        Map<String, Object> writer1 = new HashMap<>();
//        writer1.put("name", "김준일");
//        writer1.put("age", 32);
//        board1.put("writer", writer1);
//
//        List<Map<String, String>> comments1 = new ArrayList<>();
//        Map<String, String> comment1_1 = new HashMap<>();
//        comment1_1.put("writer", "김준이");
//        comment1_1.put("content", "댓글 내용1");
//        comments1.add(comment1_1);
//
//        Map<String, String> comment1_2 = new HashMap<>();
//        comment1_2.put("writer", "김준삼");
//        comment1_2.put("content", "댓글 내용2");
//        comments1.add(comment1_2);
//
//        board1.put("comments", comments1);
//        boardList.add(board1);
//
//
//        // 게시글 2 ---------------------------
//        Map<String, Object> board2 = new HashMap<>();
//        board2.put("title", "게시판 제목2");
//        board2.put("content", "게시판 내용2");
//
//        Map<String, Object> writer2 = new HashMap<>();
//        writer2.put("name", "김준사");
//        writer2.put("age", 34);
//        board2.put("writer", writer2);
//
//        List<Map<String, String>> comments2 = new ArrayList<>();
//        Map<String, String> comment2_1 = new HashMap<>();
//        comment2_1.put("writer", "김준오");
//        comment2_1.put("content", "댓글 내용11");
//        comments2.add(comment2_1);
//
//        Map<String, String> comment2_2 = new HashMap<>();
//        comment2_2.put("writer", "김준육");
//        comment2_2.put("content", "댓글 내용22");
//        comments2.add(comment2_2);
//
//        board2.put("comments", comments2);
//        boardList.add(board2);
//
//
//        // 전체 게시판 출력
//        System.out.println(boardList);
//    }
//}
//
