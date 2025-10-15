package com.korit.study.ch08;

public class IsEven {

    static boolean even(int number) {
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(even(3));
    }
}
