package com.korit.study.ch17;

import java.util.Arrays;

public class User {
    private String username;
    private String password;
    private String[] roles;

    public User(String test, String number, String[] roles) {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }

    public String[] getRoles() {
        return roles;


    }
}
