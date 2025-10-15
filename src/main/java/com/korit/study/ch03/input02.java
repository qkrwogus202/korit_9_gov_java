package com.korit.study.ch03;

import java.util.Scanner;

public class input02 {
    public static void main(String [] args) {
        Scanner scanneer = new Scanner(System.in);
        System.out.println("1번 주소와 2번 주소를 입력하세요: ");
        String address1 = scanneer.next();
        String address2 = scanneer.next();
        System.out.println("주소1: " + address1);
        System.out.println("주소2: " + address2);
        int num1 = Integer.parseInt(scanneer.next());
        int num2 = Integer.parseInt(scanneer.next());
        System.out.println("num1 + num2 = " + (num1 + num2));
        int num3 = scanneer.nextInt();
        int num4 = scanneer.nextInt();
        System.out.println("num3 + num4 = " + (num3 + num4));
        scanneer.nextLine();
        String addressAll = scanneer.nextLine();
        System.out.println("전체 주소: + addressAll");



    }
}
