package com.korit.study.ch16.service;

import com.korit.study.ch16.repository.TodoList;
import com.korit.study.ch16.dto.TodoRehisterDto;
import com.korit.study.ch16.entity.Todo;
import com.korit.study.ch16.entity.User;

public class TodoService {

    TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    public void register(TodoRehisterDto todoRehisterDto) {
        Todo todo = todoRehisterDto.toTodo();
        todo.setId(todoList.generatedTodoId());
        todoList.add(todo);
    }

    public void printAllByUserId(User user) {
        Todo[] foundTodos = todoList.finAllByUserId(user.getId());
        for (Todo todo : foundTodos) {
            System.out.println(todo.toString());
        }
    }


}
