package com.korit.study.ch16.entity;

import java.time.LocalDateTime;

public class Todo {
    public int id;
    private String contents;
    public User user;
    private LocalDateTime createdAt;



    public Todo(int id, String contents, User user, LocalDateTime createdAt) {
        this.id = id;
        this.contents = contents;
        this.user = user;
        this.createdAt = createdAt;
    }
        public void setId(int id) {
            this.id = id;
        }

    public int getId() {
        return id;
    }

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
