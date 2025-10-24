package com.korit.study.ch24;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;

public class BoardMainReview {
    public static void main(String[] args) {
        // 게시판
        /**
         * [    -> new ArrayList<HashMap<String, Object>>()
         *      {    -> new HashMap<String, Object>()
         *          "title": "게시판 제목1",
         *          "writer": {     -> new HashMap<String, Object>()
         *              "name": "김준일",
         *              "age": 32
         *          },
         *          "content": "게시판 내용1",
         *          "comments": [       -> new ArrayList<HashMap<String, String>>()
         *              {    -> new HashMap<String, String>()
         *                  "writer": "김준이",
         *                  "content": "댓글 내용1"
         *              },
         *              {    -> new HashMap<String, String>()
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },
         *      {    -> new HashMap<String, Object>()
         *          "title": "게시판 제목2",
         *          "writer": {    -> new HashMap<String, Object>()
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [       -> new ArrayList<HashMap<String, String>>()
         *              {    -> new HashMap<String, String>()
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {    -> new HashMap<String, String>()
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */
        // HashMap - m1
        HashMap<String, Object> m1 = new HashMap<String, Object>();
        m1.put("name", "김준일");
        m1.put("age", 32);

        HashMap<String, String> m2 = new HashMap<String, String>();
        m2.put("writer", "김준이");
        m2.put("content", "댓글 내용1");

        HashMap<String, String> m3 = new HashMap<String, String>();
        m3.put("writer", "김준삼");
        m3.put("content", "댓글 내용2");

        /////////////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<HashMap<String, String>> l1 = new ArrayList<HashMap<String, String>>();
        l1.add(new HashMap<String, String>());
        l1.add(new HashMap<String, String>());
        l1.get(0).put("writer", "김준이");
        l1.get(0).put("content", "댓글 내용1");
        l1.get(1).put("writer", "김준삼");
        l1.get(1).put("content", "댓글 내용2");

        //////////////////////////////////////////////////////////////////////////////////////////////

        HashMap<String, Object> boardMap1 = new HashMap<String, Object>();
        boardMap1.put("title", "게시판 제목1");
        boardMap1.put("writer", new HashMap<String, Object>());
        ((HashMap<String, Object>) boardMap1.get("writer")).put("name", "김준일");
        ((HashMap<String, Object>) boardMap1.get("writer")).put("age", 32);
        boardMap1.put("content", "게시판 내용1");
        boardMap1.put("comments", new ArrayList<HashMap<String, String>>());
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).add(new HashMap<String, String>());
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).add(new HashMap<String, String>());
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).get(0).put("writer", "김준이");
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).get(0).put("content", "댓글 내용1");
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).get(1).put("writer", "김준삼");
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).get(1).put("content", "댓글 내용2");

        HashMap<String, Object> boardMap2 = new HashMap<String, Object>();
        boardMap2.put("title", "게시판 제목2");
        boardMap2.put("writer", new HashMap<String, Object>());
        ((HashMap<String, Object>) boardMap2.get("writer")).put("name", "김준사");
        ((HashMap<String, Object>) boardMap2.get("writer")).put("age", 30);
        boardMap2.put("content", "게시판 내용2");
        boardMap2.put("comments", new ArrayList<HashMap<String, String>>());
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).add(new HashMap<String, String>());
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).add(new HashMap<String, String>());
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).get(0).put("writer", "김준오");
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).get(0).put("content", "댓글 내용1");
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).get(1).put("writer", "김준육");
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).get(1).put("content", "댓글 내용2");

        ArrayList<HashMap<String, Object>> boardList = new ArrayList<HashMap<String, Object>>();
        boardList.add(boardMap1);
        boardList.add(boardMap2);

        System.out.println(boardList);
    }
}
