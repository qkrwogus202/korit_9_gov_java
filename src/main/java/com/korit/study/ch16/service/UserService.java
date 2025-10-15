package com.korit.study.ch16.service;

import com.korit.study.ch16.repository.UserList;
import com.korit.study.ch16.dto.SigninDto;
import com.korit.study.ch16.dto.SignupDto;
import com.korit.study.ch16.entity.User;

import java.util.Scanner;


public class UserService {
    private String password;
    //UserList에 대한 객체 생성
    //UserService의 성분 표시
    UserList userList = new UserList();

    Scanner scanner = new Scanner(System.in);

    // UserService에 대한 생성자 만들기
    public UserService(UserList userList) {
        this.userList = userList;
    }

    public boolean isduplicatedUsername(String username) {
        // userList에 username이 이미 있으므로 중복되었다
        return userList.findByUsername(username) != null;
    }

    // 로그인
    public User signin(SigninDto signinDto) {
        User foundUser = userList.findByUsername(signinDto.getUsername());
        if (foundUser == null) {
            // 사용자이름
            return null;
        }
        if (!foundUser.getPassword().equals(signinDto.getPassword())) {
            return null;
        }
        return foundUser;
    }


    // 회원가입
    public void signup(SignupDto signupDto) {
        User user = signupDto.toUser();
        user.setId(userList.generateUserId());
        userList.add(user);
    }

    public void printUserListAll() {
        System.out.println("등록된 사용자 전체 조회하기");
        for (User user : userList.findAll()) {
            System.out.println(user.toString());
        }
    }
}