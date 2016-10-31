package step11;

public class Exam073_0 {
  static class A {
    int v1;
    void m1(String value) {
      v1 = 100;
      System.out.printf("A.m1()\n");
    }
  }
  static class B extends A {
    int v2;
    //수퍼 클래스의 메서드 재정의
    void m1(String v) {
      this.v1 = 200;
      this.v2 = 200;
      System.out.printf("B.m1()\n");
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.m1("2000");
    System.out.println(obj.v1);
    System.out.println(obj.v2);
  }
}
