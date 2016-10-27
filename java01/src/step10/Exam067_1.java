package step10;

import java.util.Scanner;

public class Exam067_1 {
  static class Book {
    String title;
    String author;
    String press;
    int pages;
    boolean local;

    public Book() {}
    public Book(String title) {
      this.title = title;
      System.out.println("Book(Stirng)");
    }
    public Book(String title, String press) {
      this(title); //제목을 파라미터로 받는 동료 생성자를 호출한다.
      this.press = press;
      System.out.println("Book(Stirng, String)");
    }
    public Book(String title, String press, String author, int pages) {
      this(title, press); //현재 클래스의 다른 생성자를 호출한다.
      this.author = author;
      this.pages = pages;
      System.out.println("Book(Stirng, String, String, int)");
    }
  }

  public static void main(String[] args) {
    Book book = new Book();
    System.out.println("----------------------");
    Book book2 = new Book("java programming");
    System.out.println("----------------------");
    Book book3 = new Book("java programming", "bit press");
    System.out.println("----------------------");
    Book book4 = new Book("java programming", "bit press", "hong gil-dong", 80);
    System.out.println("----------------------");
  }
}
