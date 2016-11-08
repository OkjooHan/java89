/* 주제 : 예외 처리 - throw로 던질 수 있는 객체
*/
package step14;

import java.util.Scanner;

public class Exam080_4 {
  static int m1() {
    throw new Error("예외 발생");
  }

  static int m2() throws Error {
    throw new Error("예외 발생");
  }

  public static void main(String[] args) throws Exception{
    // m1();

    // try {
    //   m1();
    // } catch (Error e) { 
    //   System.out.println(e.getMessage());
    // }
    m2();
  }
}
/*
*/
