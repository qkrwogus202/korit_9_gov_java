package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class input01 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner s = new Scanner(inputStream);
        String str = s.nextLine();
//    이걸로 해도 됨    System.out.println(String.format("입력값 : %s", str));
        System.out.println("입력값 : " + str);
        String address = s.nextLine();
        System.out.println("주소 : " + address);
        System.out.println();





    }
}
