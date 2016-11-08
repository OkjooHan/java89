/* 주제 : 예외 처리 - throw로 던질 수 있는 객체
*/
package step14;

import java.util.Scanner;

public class Exam080_8 {
  static void m1() {
    m2();
  }

  static void m2() {
    m3();
  }

  static void m3() {
    m4();
  }

  static void m4() {
    throw new RuntimeException("예외발생");
  }

  public static void main(String[] args) {
    try {
      m1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
/*
*/
