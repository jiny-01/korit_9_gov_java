package com.korit.study.ch14;

public class TodoList {

    Todo[] todos;

    TodoList() {
        todos = new Todo[0];
    }

//    int generatedTodoId() {
//        if (todos.length == 0) {
//            return 1;
//        }
//        return todos[todos.length - 1].id + 1;
//    }

    int generatedTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].id + 1;
    }

    void add (Todo todo) {
        Todo[] temp = new Todo[todos.length + 1];
        for (int i = 0; i < todos.length; i++) {
            temp[i] = todos[i];
        }
        temp[temp.length - 1] = todo;
        todos = temp;
    }

    //다건 조회
    //유저로 찾아서 todo 여러 개 -> 배열로 리턴
    Todo[] findAllByUserId(int userId) {
        int foundTodoCount = 0;
        for (Todo todo: todos) {
            if (todo.user.id == userId) {   //todo 의 유저 id = 유저 id 이면
                foundTodoCount++;           //찾은 todo 하나씩 카운트
            }

        }
        Todo[] foundTodos = new Todo[foundTodoCount];   //찾은 todo 들
        for (int i = 0, j = 0; i < todos.length; i++) {  //todos 와 분리
         if (todos[i].user.id == userId) {
             foundTodos[j] = todos[i];                   //계속 j = 0
             j++;                                        //찾고 대입이 성공적일 때 j 를 +1
         }
        }
        return foundTodos;                               //찾은 todo 만 리턴
    }
}
