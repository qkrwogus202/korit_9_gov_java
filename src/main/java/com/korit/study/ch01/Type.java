package com.korit.study.ch01;

import java.util.Date;

/**
 *
 */
public class Type {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
//      논리 자료형
        boolean open;
        open = true;
        System.out.println(open);
        open = false;
        System.out.println(open);

//      문자 자료형
        char lastName = '박';
        System.out.println(lastName);
//        char firstName = '재현';

//      문자열 자료형
        String firstName = "재현";
        System.out.println(firstName);
        String contents1 = "안녕하세요. \n박재현입니다.";
        System.out.println(contents1);
        String contents2 = """
                안녕하세요.
                박재현입니다.""";
        System.out.println(contents2);

//      숫자
        double avg = 89.33;
        System.out.println(avg);
        int number = 10000000;
        System.out.println(number);
        int nowTime = (int) new Date().getTime();
        System.out.println(nowTime);
        long longNumber = 2200000000l;
        System.out.println(longNumber);

//      상수
        final String uploadPath = "~/upload/imag";
        final String UPLOAD_PATH = "!/upload/imag";



    }
}

