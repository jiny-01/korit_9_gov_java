package com.korit.study.ch24;

public class Comment {
    private Writer writer;   //Writer 객체 가져옴
    private String content;

    public Comment(Writer writer, String content) {
        this.writer = writer;
        this.content = content;
    }

    public Comment() {
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Comments{" +
                "writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
