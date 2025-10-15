package com.korit.study.ch10;

import java.sql.SQLOutput;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.name = "김준일";
        a.age = 32;
        System.out.println(a.name);
        System.out.println(a.age);


        ClassB b = new ClassB("김준이", 33);
        System.out.println(b.name);
        System.out.println(b.age);

        ClassC c = new ClassC("박재현", 24, "남구");
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.address);

        ClassC c2 = new ClassC();


    }
}
