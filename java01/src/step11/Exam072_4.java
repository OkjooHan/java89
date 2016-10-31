package step11;

public class Exam072_4 {
  static class A {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }
  static class B extends A {
    int v2;
    void m2() {
      System.out.println("B.m2()");
    }
  }
  static class C extends B {
    int v3;
    void m1() {
      System.out.println("C.m1()");
    }
    void m3() {
      System.out.println("C.m3()");
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    obj1.m1(); //ok
    //((C)obj1).m2(); //컴파일 통과. 타입 캐스팅 오류.
    //((C)obj1).m3(); //컴파일 통과. 타입 캐스팅 오류.
    System.out.println("-------------------");

    //타입 캐스팅(형변환)을 통해 하기보다 아예 레퍼런스 변수에 저장하는 방법.
    C temp = (C)obj1; //컴파일 통과. 타입 캐스팅 오류.
    temp.m1();
    temp.m2();
    temp.m3();

  }
}
