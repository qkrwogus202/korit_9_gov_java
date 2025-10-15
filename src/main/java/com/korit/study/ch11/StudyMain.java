package com.korit.study.ch11;

import com.korit.study.ch10.ClassB;

import javax.naming.Name;

public class StudyMain {
    public static void main(String[] args) {
        //과목명 : JAVA 기초
        //담당 선생님 이름 : 김준일
        //담당 선생님 나이 : 32
        //학생1 ID : 20250001
        //학생1 이름 : 박재현
        //학생1 나이 : 24
        //학생2 ID : 20250002
        //학생2 이름 : 고대한
        //학생2 나이 : 19
        //학생3 ID : 20250003
        //학생3 이름 : 양재원
        //학생3 나이 : 27
        //스터디 객체를 생성하시오.
//
//        Study study = new Study();
//        study.name = "JAVA 기초";
//        System.out.println(study.name);
//
//        Teacher teacher = new Teacher("김준일", 32);
//        System.out.println("담당 선생님 이름 : " + teacher.name);
//        System.out.println("담당 선생님 나이 : " + teacher.age);
//
//        Student student1 = new Student(20250001, "박재현", 24);
//        System.out.println("학생1 ID : " + student1.id);
//        System.out.println("학생1 이름 : " +student1.name);
//        System.out.println("학생1 나이 : " + student1.age);
//
//        Student student2 = new Student(20250002, "고대한", 19);
//        System.out.println("학생2 ID : " + student2.id);
//        System.out.println("학생2 이름 : " +student2.name);
//        System.out.println("학생2 나이 : " + student2.age);
//
//        Student student3 = new Student(20250003, "양재원", 27);
//        System.out.println("학생3 ID : " + student3.id);
//        System.out.println("학생3 이름 : " +student3.name);
//        System.out.println("학생3 나이 : " + student3.age);
        int[] nums = new int[] {1,2,3,4};
        Student s1 = new Student(20250001, "박재현", 24);
        Student s2 = new Student(20250002, "고대한", 19);
        Student s3 = new Student(20250003, "양재원", 27);

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        Teacher teacher = new Teacher("김준일", 32);

        Subject subject = new Subject("JAVA 기초", teacher);

        Study study = new Study(subject, students);

        StudyPrintService studyPrintService = new StudyPrintService();
        studyPrintService.printInfoAll(study);
        System.out.println("==================");
        studyPrintService.printInfoSubject(study.subject);
        System.out.println("==================");
        studyPrintService.printInfoTeacher(study.subject.teacher);
        System.out.println("==================");
        studyPrintService.printInfoStudent(study.students[0]);

    }
}



