package com.korit.study.ch06;


public class Function1 {

    static int sum(int a, int b, int c, int d) {
        return a+b+c+d;

    }

    static int sum2(int a, int b) {
        int c = a+b;
        return c;
    }


    public static void main(String[] args) {
        int result = sum(10, 20,30,40);
        System.out.println(result);
        System.out.println(sum2(10, 20));

    }
}