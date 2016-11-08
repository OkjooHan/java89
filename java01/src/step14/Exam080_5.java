/* 주제 : 예외 처리 - throw로 던질 수 있는 객체
*/
package step14;

import java.util.Scanner;

public class Exam080_5 {
  static void m1() {
    //throw new Exception("예외 발생");
  }

  static void m2() throws Exception {
    throw new Exception("예외 발생");
  }

  public static void main(String[] args) throws Exception {
  //   try {
  //     m2();
  //   } catch (Exception e) {
  //     System.out.println("예외가 발생");
  //   }
  // }
    m2();
  }
}
/*
*/
