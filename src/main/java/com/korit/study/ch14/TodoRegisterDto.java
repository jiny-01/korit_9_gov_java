package com.korit.study.ch14;

import java.time.LocalDateTime;

public class TodoRegisterDto {
    String contents;
    User user;

    public TodoRegisterDto(String contents, User user) {
        this.contents = contents;
        this.user = user;
    }

    @Override
    public String toString() {
        return "TodoRegisterDto{" +
                "contents='" + contents + '\'' +
                ", user=" + user +
                '}';
    }

    Todo toTodo() {
        return new Todo(0, contents, user, LocalDateTime.now());
    }
}
