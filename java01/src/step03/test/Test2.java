/*
Quiz!
클래스 문법을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에 저장하고 그 메모리의 값을 출력하라.
*/
package step03.test;

public class Test2 {
  static class Book {
    String isbn;
    String title;
    String[] writer;
    String publisher;
    String language;
    double price;
    String genre;
    int pageSize;
    String release_date;
    int stock;
    boolean dvd;
  }

  public static void main(String[] args) {
    Book book = new Book();

    book.isbn = "9788990982667";  //isbn 번호
    book.title = "천공의 별"; //책 제목
    book.writer = new String[] {"히가시노 게이고", "홍길동"};
    book.publisher = "재인"; //출판사명
    book.language = "korean"; //언어
    book.price = 18800; //가격
    book.genre = "추리/미스터리소설"; //장르
    book.pageSize = 676; //페이지수
    book.release_date = "2016-09-12"; //출간일
    book.stock = 100; //재고수량
    book.dvd = false;

    System.out.println("isbn : " + book.isbn);
    System.out.println("책 제목 : " + book.title);
    System.out.print("작가 : ");
    for(String writer : book.writer) {
      System.out.print( writer);
      System.out.print(", ");
    }
    System.out.print("\n");
    System.out.println("출판사 : " + book.publisher);
    System.out.println("언어 : " + book.language);
    System.out.println("가격 : " + book.price);
    System.out.println("장르 : " + book.genre);
    System.out.println("쪽수 : " + book.pageSize);
    System.out.println("출간일 : " + book.release_date);
    System.out.println("재고수량 : " + book.stock);
    System.out.println("DVD여부 : " + book.dvd);
  }
}
