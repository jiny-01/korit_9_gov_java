package com.korit.study.ch14;

public class TodoListMain {
    public static void main(String[] args) {
        //UserService 쓰려면 UserList 필요 - UserList 안에 findByUsername 이런 함수있음

        UserList userList = new UserList();
        //UserService 가져오기
        UserService userService = new UserService(userList);
        TodoList todoList = new TodoList();
        TodoService todoService = new TodoService(todoList);

        TodoListView view = new TodoListView(userService, todoService);
        //TodoListView view = new TodoListView(userService, userList); 처럼 바로 userList 의존하지 말고
        //단계적으로 거쳐서 의존하게끔 - 유지보수 측면

        view.homeView();

        System.out.println("==<< 프로그램 종료 >>==");
    }
}
