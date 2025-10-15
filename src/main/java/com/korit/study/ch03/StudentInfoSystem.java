package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요 : " );
        String name = scanner.next();
        System.out.print("나이를 입력하세요 : " );
        int age = scanner.nextInt();
        System.out.print("학년을 입력하세요 : " );
        int studenYears = scanner.nextInt();
        System.out.print("국어 점수를 입력하세요 : " );
        double korScore = scanner.nextDouble();
        System.out.print("영어 점수를 입력하세요 : " );
        double engScore = scanner.nextDouble();
        System.out.print("수학 점수를 입력하세요 : " );
        double mathScore = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("자기소개를 입력하세요 : ");
        String introduction = scanner.nextLine();

        double totalScore = korScore + engScore + mathScore;
        double avgScore = totalScore / 3;
        String grade = avgScore > 95 ? "A+" :
        avgScore >= 90 ? "A" :
        avgScore >= 85 ? "B+" :
                avgScore >= 80 ? "B" :
                        avgScore >= 75 ? "C+" :
                                avgScore >= 70 ? "C" :
                                        avgScore >= 65 ? "D+" :
                                                avgScore >= 60 ? "D" : "F";
        System.out.println("===학생 정보===");
        System.out.println(String.format("""
                이름: %s
                나이: %d세
                성적:
                  국어: %.2f점
                  영어: %.2f점
                  수학: %.2f점
                  평균: %.2f점 (학점: %s)
                자기소개: %s""", name, age, korScore, engScore, mathScore, avgScore, grade, introduction));





        // 여기에 코드를 작성하세요
        // next(), nextInt(), nextLine() 모두 사용


    }
}
