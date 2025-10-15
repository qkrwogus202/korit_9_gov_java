package com.korit.study.ch16.dto;

import com.korit.study.ch16.entity.User;

public class SignupDto {
    String username;
    String password;
    String name;

    public SignupDto(String password, String username, String name) {
        this.password = password;
        this.username = username;
        this.name = name;


    }

    public String getUsername() {
        return username;

    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {

        return "SignupDto{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public User toUser() {
        return new User(0, username, password, name);
    }
}



