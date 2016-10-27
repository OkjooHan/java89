package step10;

import java.util.Scanner;

public class Exam064_0 {
  static {
    System.out.println("Exam064_0: 스태틱 초기화 블록");
  }

  static class MyType {
    static int a;
    int b;

    static {
      System.out.println("MyType: 스태틱 초기화 블록");
    }
    static void m1() {
      System.out.println("MyType: m1()");
    }
  }

  public static void main(String[] args) {
    System.out.println("main()....");
    //MyType.a = 100;
    //MyType.m1();
    //new MyType();
    //new MyType();

    MyType obj = null;
  }
}
