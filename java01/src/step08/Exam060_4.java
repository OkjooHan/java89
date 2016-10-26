package step08;

public class Exam060_4 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    //생성자가 단 하나라도 있으면 컴파일러는 기본 생성자를 만들어주지 않는다.
    Book() {} //기본생성자
    Book(String title) {
      System.out.println("Book(title) 호출");
      this.title = title;
    }
    Book(String title, String author) {
      System.out.println("Book(title, author) 호출");
      this.title = title;
      this.author = author;
    }
    Book(String title, String press, int price) {
      System.out.println("Book(title, press, price) 호출");
      this.title = title;
      this.press = press;
      this.price = price;
    }
  }

  public static void main(String[] args) {
    //Book b1 = new Book(); // 컴파일 오류! 기본 생성자가 없기 때문
    Book b1 = new Book();
    Book b2 = new Book("자바 프로그래밍");
    Book b3 = new Book("자바 프로그래밍", "홍길동");
    Book b4 = new Book("자바 프로그래밍", "비트출판사", 30000);
    //Book b5 = new Book(30000, 890); //컴파일 오류! int값 두 개 받는 생성자 없음.
  }
}
