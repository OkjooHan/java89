package step11;

public class Exam070_3 {
  static class A {
    int v1 = 10;
    int v3 = 10;
    void m1() {
      System.out.printf("A.m1(): v1=%d\n", this.v1);
      System.out.printf("A.m1(): v3=%d\n", this.v3);
    }
  }
  static class B extends A {
    int v1 = 100;
    int v2 = 100;
    void m2() {
      System.out.printf("B.m2(): v1=%d\n", this.v1);
      System.out.printf("B.m2(): v2=%d\n", this.v2);
      System.out.printf("A.m2(): v3=%d\n", this.v3);
    }
  }

  public static void main(String[] args) {
    A obj = new A();
    obj.m1();
    System.out.println("---------------");

    B obj2 = new B();
    obj2.m2();
    obj2.m1();
  }
}
