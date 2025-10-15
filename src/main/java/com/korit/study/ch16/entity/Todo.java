package com.korit.study.ch16.entity;

import java.time.LocalDateTime;

// Entity 역할
public class Todo {
    private int id;
    private String contents;
    private User user;
    private LocalDateTime createdAt;   //날짜, 시간 포함

    public Todo(int id, String contents, User user, LocalDateTime createdAt) {
        this.id = id;
        this.contents = contents;
        this.user = user;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //todo 에서 User 객체를 꺼내오기 위함
    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", user=" + user +
                ", createdAt=" + createdAt +
                '}';
    }
}
