package step11;

public class Exam070_1 {
  static class A {
    int v1;
  }
  static class B extends A {
    int v2;
  }
  static class C extends B {
    int v3;
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.v3 = 100;
    System.out.println(obj.v3);

    obj.v2 = 200;
    System.out.println(obj.v2);

    obj.v1 = 300;
    System.out.println(obj.v1);
  }
}
