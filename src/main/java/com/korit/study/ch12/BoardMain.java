package com.korit.study.ch12;

public class BoardMain {
    public static void main(String[] args) {



       // Writer 3명 생성
       //작가에 대한 객체 생성
        Writer w1 = new Writer(1, "박재현");
        Writer w2 = new Writer(2, "고대한");
        Writer w3 = new Writer(3, "양재원");


        //Comment 4개 생성
        //작성자 Comment 대한 객체 생성
        Comment c1 = new Comment(1, "운동", w1);
        Comment c2 = new Comment(2, "공부", w2);
        Comment c3 = new Comment(3, "미술", w3);
        Comment c4 = new Comment(4,"몰라", w3);

        Comment[] comments = new Comment[] {c1 ,c2, c3, c4};


        // Board 배열 2개의 공간 생성
        Board b1 = new Board(24, "자바", "기초", w1, c1);
        Board b2 = new Board(23, "자바2", "기초2", w2, c2);
        Board[] boards = new Board[] {b1, b2};


        System.out.println("작성자 아이디 : " + boards[0].id);
        System.out.println("작성자 게시물 제목 : " + boards[0].title);
        System.out.println("작성자 내용 : " + boards[0].contents);
        System.out.println("작가 아이디 : " + boards[0].writer.writerid);
        System.out.println("작가 이름 : " + boards[0].writer.writername);


        System.out.println("----------------------------------");
        System.out.println("작성자 아이디 : " + boards[1].id);
        System.out.println("작성자 게시물 제목 : " + boards[1].title);
        System.out.println("작성자 내용 : " + boards[1].contents);
        System.out.println("작가 아이디 : " + boards[1].writer.writerid);
        System.out.println("작가 이름 : " + boards[1].writer.writername);







        //Board 배열 - boards -> 게시글 2개

        //Board - id(정수) title(문자열) contents(문자열) writer(Writer) comments(Comment[])

        //Writer - id(정수), name(문자열)

        //Comment - id(정수) contents(문자열), writer(Writer)

        // Board배열 2개의 공간 생성
        // Writer 3명 생성
        // Comment 4개 생성
        // Board 2개 생성 -> 게시글 작성자와 댓글 작성자는 원하는 작성자를 주입한다.
    }
}
