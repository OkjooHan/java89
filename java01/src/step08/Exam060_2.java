package step08;

public class Exam060_2 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book() {
      System.out.println("Book()");
    }
  }

  public static void main(String[] args) {
    Book b1 = new Book();
  }
}
