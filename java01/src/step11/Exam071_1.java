package step11;

public class Exam071_1 {
  static class A {
    void m1() {
      System.out.printf("A.m1()\n");
    }
  }
  static class B extends A {
    void m1() {
      System.out.printf("B.m1()\n");
    }
    void m2() {
      System.out.printf("B.m2()\n");
    }
  }

  public static void main(String[] args) {
    A obj = new A();
    obj.m1();

    B obj2 = new B();
    obj2.m2();
    obj2.m1();
  }
}
