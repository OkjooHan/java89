package step10;

import java.util.Scanner;

public class Exam063_4 {
  static class MyType {
    static int a;
    int b;

    static void m1() {
      System.out.println("스태틱 메서드 호출...");
      MyType.a = 100;
      a = 200;

      //this.b = 300;
      //b = 400;
    }
    void m2() {
      System.out.println("인스턴스 메서드 호출...");

      MyType.a = 500;
      a = 600;
      this.b = 700;
      b = 800;
    }
  }

  public static void main(String[] args) {

  }
}
