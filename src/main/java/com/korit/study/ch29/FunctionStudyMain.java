package com.korit.study.ch29;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

class UserDto {
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class UserEntity {
    private String username;
    private String encodePassword;

    public UserEntity(String username, String encodePassword) {
        this.username = username;
        this.encodePassword = encodePassword;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", encodePassword='" + encodePassword + '\'' +
                '}';
    }
}


public class FunctionStudyMain {
    public static void main(String[] args) {
        Function<Map<String, Object>, Map<String, Object>> passwordEncoding = data -> {
            data.replace("password", Objects.hash(data.get("password")) * 10);
            return data;
        };

        Map<String, Object> userMap = new HashMap<>();
        userMap.put("username", "test1234");
        userMap.put("password", "1234");
        System.out.println(userMap);
        Map<String, Object> passwordEncodeUserMap = passwordEncoding.apply(userMap);
        System.out.println(passwordEncodeUserMap);

        UserEntity userEntity = passwordEncoding
                .compose(userDto -> {

                    Map<String, Object> map = new HashMap<>();
                    map.put("username", ((UserDto)userDto).getUsername());
                    map.put("password", ((UserDto)userDto).getUsername());
                    return map;
        })
                .andThen(map -> {
                    return new UserEntity(map.get("username").toString(),
                            map.get("password").toString());
                })
                .apply(new UserDto("aaa", "1234"));
        System.out.println(userEntity);
    }
}
