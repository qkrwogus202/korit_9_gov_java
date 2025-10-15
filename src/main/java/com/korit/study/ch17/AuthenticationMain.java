package com.korit.study.ch17;

public class AuthenticationMain {
    public static void main(String[] args){
        String[] roles = {"ROLE_USER", "ROLE_ADMIN"};
        User user = new User("test", "1234", roles);
        PrincipalAuthentication principal =
                new PrincipalAuthentication(user);

        principal.chekAuthority();
        System.out.println(principal.containAuthority("admin2"));
    }
}
