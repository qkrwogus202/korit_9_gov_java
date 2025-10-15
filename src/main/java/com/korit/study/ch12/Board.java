package com.korit.study.ch12;

public class Board {

    int id;
    String title;
    String contents;
    Writer writer;
    Comment comment;

    Board(int id, String title, String contents, Writer writer, Comment comment) {
      this.id = id;
      this.title = title;
      this.contents = contents;
      this.writer = writer;
      this.comment = comment;

    }



    //id(정수) title(문자열) contents(문자열) writer(Writer) comments(Comment[])

}
