package step11;

public class Exam072_0 {
  static class A {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }
  static class B extends A {
    int v2;
    void m2() {
      this.v1 = 100;
      this.v2 = 200;
      System.out.println("B.m2()");
    }
  }
  static class C extends B {
    int v3;
    void m3() {
      this.v1 = 100;
      this.v2 = 200;
      this.v3 = 300;
      System.out.println("C.m3()");
    }
  }

  public static void main(String[] args) {
    A a1 = new A(); //ok
    A a2 = new B(); //ok
    A a3 = new C(); //ok

    //B b1 = new A(); //컴파일 오류
    //b1.m2(); //B의 m2() 메서드에서 B의 v2 변수를 사용할 수 있기 때문에.
    B b2 = new B(); //ok
    B b3 = new C(); //ok

    //C c1 = new A(); //컴파일 오류
    //C c2 = new B(); //컴파일 오류
    C c3 = new C(); //ok
  }
}
