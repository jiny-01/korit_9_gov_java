package com.korit.study.ch24;


import java.util.List;

public class Board {
    private String title;
    private Writer writer;
    private String content;
    private List<Comment> comments;

    public Board(String title, Writer writer, String content, List<Comment> comments) {
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.comments = comments;    //?
    }

    public Board() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "ListBoard{" +
                "title='" + title + '\'' +
                ", writer=" + writer +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                '}';
    }
}
