package step11;

public class Exam073_2 {
  static class A {
    int v1;
    void m1(String value, int value2) {
      System.out.printf("A.m1()\n");
    }
    void m2() {
      System.out.printf("A.m2()\n");
    }
  }
  static class B extends A {
    int v2;
    void m1(String v, int v2) {
      System.out.printf("B.m1()\n");
    }
    void m3() {
      System.out.printf("B.m3()\n");
    }
  }

  public static void main(String[] args) {
    A obj2 = new A();
    obj2.m1("2000", 2000);
    obj2.m2();
    System.out.println("-------------");

    B obj = new B();
    obj.m1("2000", 2000);
    obj.m2();
    obj.m3();
    System.out.println("-------------");

    //이 예제의 핵심!!!!
    A obj3 = new B();
    obj3.m1("2000", 2000);
    obj3.m2();
    obj3.m3();
    System.out.println("-------------");
  }
}
