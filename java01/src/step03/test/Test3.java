/*
Quiz!
클래스 문법을 이용하여 쇼핑몰의 한 개의 제품 정보를 저장하고 출력하라
*/
package step03.test;

public class Test3 {
  static class Product {
    String name;
    String maker;
    int price;
    int quantity; //재고
    String description;
    String no;
    String[] color;
    int[] size;
    boolean used; //중고여부
  }

  public static void main(String[] args) {
    Product p = new Product();

    p.name = "다운패딩점퍼";
    p.maker = "앤듀";
    p.price = 42630;
    p.quantity = 100;
    p.description = "따수워요. 많이사";
    p.no = "O154Z1002P";
    p.color = new String[] {"red", "black", "white"};
    p.size = new int[] {90, 95, 100};
    p.used = false;

    System.out.println("제품명 : " + p.name);
    System.out.println("브랜드 : " + p.maker);
    System.out.println("가격 : " + p.price);
    System.out.println("재고수량 : " + p.quantity);
    System.out.println("상세정보 : " + p.description);
    System.out.println("제품코드 : " + p.no);
    System.out.print("색상 : ");
    for (String color : p.color) {
      System.out.print(color + ", ");
    }
    System.out.print("\n사이즈 : ");
    for (int size : p.size) {
      System.out.print(size + ", ");
    }
    System.out.print("\n");
    System.out.println("중고여부 : " + p.used);
  }
}
