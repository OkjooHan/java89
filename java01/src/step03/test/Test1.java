/*
Quiz!
자바 원시 타입과 String을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에 저장하고 그 메모리의 값을 출력하라.
*/
package step03.test;

public class Test1 {
  public static void main(String[] args) {
    String isbn = "9788990982667";  //isbn 번호
    String title = "천공의 별"; //책 제목
    String writer = "히가시노 게이고"; //작가명
    String publisher = "재인"; //출판사명
    String language = "korean"; //언어
    double price = 18800; //가격
    String genre = "추리/미스터리소설"; //장르
    int pageSize = 676; //페이지수
    String release_date = "2016-09-12"; //출간일
    int stock = 100; //재고수량
    boolean dvd = false;

    System.out.println("isbn : " + isbn);
    System.out.println("책 제목 : " + title);
    System.out.println("작가 : " + writer);
    System.out.println("출판사 : " + publisher);
    System.out.println("언어 : " + language);
    System.out.println("가격 : " + price);
    System.out.println("장르 : " + genre);
    System.out.println("쪽수 : " + pageSize);
    System.out.println("출간일 : " + release_date);
    System.out.println("재고수량 : " + stock);
    System.out.println("DVD여부 : " + dvd);
  }
}
