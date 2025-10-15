package com.korit.study.ch14;

public class SignupDto {
    String username;
    String password;
    String name;

    public SignupDto(String password, String username, String name) {
        this.password = password;
        this.username = username;
        this.name = name;


    }

    @Override
    public String toString() {
        return "SignupDto{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    User toUser() {
        return new User(0, username, password, name);
    }
}



