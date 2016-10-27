package step10;

import java.util.Scanner;

public class Exam067_0 {
  static class Book {
    String title;
    String author;
    String press;
    int pages;
    boolean local;

    public Book() {}
    public Book(String title) {
      this.title = title;
    }
    public Book(String title, String press) {
      this.title = title;
      this.press = press;
    }
    public Book(String title, String press, String author, int pages) {
      this.title = title;
      this.press = press;
      this.author = author;
      this.pages = pages;
    }
  }

  public static void main(String[] args) {
    Book book = new Book();
    Book book2 = new Book("java programming");
    Book book3 = new Book("java programming", "bit press");
    Book book4 = new Book("java programming", "bit press", "hong gil-dong", 80);
  }
}
