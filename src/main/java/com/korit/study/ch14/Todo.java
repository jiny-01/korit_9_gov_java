package com.korit.study.ch14;

import java.time.LocalDateTime;

// Entity 역할
public class Todo {
    int id;
    String contents;
    User user;
    LocalDateTime createdAt;   //날짜, 시간 포함

    public Todo(int id, String contents, User user, LocalDateTime createdAt) {
        this.id = id;
        this.contents = contents;
        this.user = user;
        this.createdAt = createdAt;
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
