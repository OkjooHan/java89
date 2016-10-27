package step10;

import java.util.Scanner;

public class Exam066_0 {
  static class MyType {
   static int a;
   int b = 100;

   static {
      System.out.printf("스태틱 블록: a=%d\n", a);
      MyType.a = 50;
   }
   {
     System.out.printf("인스턴스 블록: a=%d, b=%d\n", MyType.a, this.b);
     this.b = 60;
   }
   public MyType() {
      System.out.printf("스태틱 블록: a=%d, b=%d\n", MyType.a, this.b);
      MyType.a = 500;
      this.b = 600;
   }
  }

  public static void main(String[] args) {
    MyType obj = new MyType();
    System.out.printf("스태틱 블록: a=%d, b=%d\n", MyType.a, obj.b);
    MyType.a = 500;
  }
}
