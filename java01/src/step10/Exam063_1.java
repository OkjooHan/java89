package step10;

import java.util.Scanner;
//클래스 당 클래스 파일 하나가 만들어진다.
public class Exam063_1 {
  //inner class, Exam063_0$MyType.class 생성됨
  static class MyType {
    static int a;
    int b;
  }

  public static void main(String[] args) {
    //스태틱 변수 사용
    MyType.a = 100;
    System.out.println(MyType.a);

    MyType obj1 = new MyType();
    MyType obj2 = new MyType();

    obj1.b = 200;
    obj2.b = 300;
    System.out.printf("MyType.a=%d, obj1.b=%d, obj2.b=%d\n",
                       MyType.a, obj1.b, obj2.b);

    obj2.a = 600;
    System.out.printf("MyType.a=%d, obj1.b=%d, obj2.b=%d\n",
                      MyType.a, obj1.b, obj2.b);

    obj2.a = 600;
    System.out.printf("MyType.a=%d, obj1.b=%d, obj2.b=%d\n",
                       MyType.a, obj1.b, obj2.b);
  }
}
