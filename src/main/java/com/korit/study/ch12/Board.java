package com.korit.study.ch12;

public class Board {

    int id;
    String title;
    String contents;
    Writer writer;
    Comment[] comments;

    Board ( int id, String title, String contents, Writer writer, Comment[] comments) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.writer = writer;
        this.comments = comments;
    }
}

