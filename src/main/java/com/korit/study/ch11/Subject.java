package com.korit.study.ch11;

import java.lang.annotation.Target;

public class Subject {
    String name;
    Teacher teacher;


//    Subject(String name, Teacher teacher){
//        this.name = name;
//        this.teacher = teacher;
//    }


    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}

