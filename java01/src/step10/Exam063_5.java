package step10;

import java.util.Scanner;

public class Exam063_5 {
  static class MyType {
    static int a;
    int b;


  }

  public static void main(String[] args) {
    int c;
    c = 100;
    MyType.a = 200;

    MyType obj = new MyType();
    obj.b = 300;
  }
}
