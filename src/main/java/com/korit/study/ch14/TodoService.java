package com.korit.study.ch14;

public class TodoService {

    TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    void register(TodoRehisterDto todoRehisterDto) {
        Todo todo = todoRehisterDto.toTodo();
        todo.id = todoList.generatedTodoId();
        todoList.add(todo);
    }

    void printAllByUserId(User user) {
        Todo[] foundTodos = todoList.finAllByUserId(user.id);
        for (Todo todo : foundTodos) {
            System.out.println(todo.toString());
        }
    }


}
