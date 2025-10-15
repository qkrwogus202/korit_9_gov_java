package com.korit.study.ch11;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student(20250001, "박재현", 24);
        System.out.println(student1.id);
        System.out.println(student1.name);
        System.out.println(student1.age);

        Student student2 = new Student(20250002, "고대한", 19);
        System.out.println(student2.id);
        System.out.println(student2.name);
        System.out.println(student2.age);

        Student student3 = new Student(20250003, "양재원", 27);
        System.out.println(student3.id);
        System.out.println(student3.name);
        System.out.println(student3.age);

    }
}
