package com.korit.study.ch16.dto;

import com.korit.study.ch16.entity.Todo;
import com.korit.study.ch16.entity.User;

import java.time.LocalDateTime;



public class TodoRehisterDto {
    private String contents;
    private User user;


    public TodoRehisterDto(String contents, User user) {
        this.contents = contents;
        this.user = user;

    }


        @Override
        public String toString() {
            return "TodoRehisterDto{" +
                    "contents='" + contents + '\'' +
                    ", user=" + user +
                    '}';
        }
            public Todo toTodo() {
                return new Todo(0, contents, user, LocalDateTime.now());
            }
    }

