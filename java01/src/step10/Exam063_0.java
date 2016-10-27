package step10;

import java.util.Scanner;
//클래스 당 클래스 파일 하나가 만들어진다.
public class Exam063_0 {
  //inner class, Exam063_0$MyType.class 생성됨
  static class MyType {
    static int a;
    int b;
  }

  public static void main(String[] args) {
    //스태틱 변수 사용
    MyType.a = 100;
    System.out.println(MyType.a);

    //MyType.b = 200; //컴파일 오류!
                    //non-static 변수(인스턴스 변수)는 인스턴스 주소가 있어야 한다.

    //인스턴스 변수 사용
    MyType my = new MyType();
    my.b = 200;

    MyType my2 = new MyType();
    my2.b = 300;
    
    System.out.println(my.b);
    System.out.println(my2.b);
  }
}
