package com.korit.study.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class input03 {
    public static void main(String [] args) throws IOException {
//        InputStream inputStream = System.in;
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader br = new BufferedReader(inputStreamReader);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Line = br.readLine();
        System.out.println(Line);

    }
}
