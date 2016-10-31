package step11;

public class Exam075_0 {
  static class A /*extends Object*/ {}
  static class B extends A /*extends Object*/ {}

  public static void main(String[] args) {
    A obj1 = new A();
    B obj2 = new B();

    if (obj1 instanceof A) {
      System.out.println("obj1은 A의 인스턴스이다.");
    }
    if (obj2 instanceof B) {
      System.out.println("obj2은 B의 인스턴스이다.");
    }
    if (obj2 instanceof A) {
      System.out.println("obj2은 A의 자손이다.");
    }
    if (obj1 instanceof Object) {
      System.out.println("obj1은 Object의 자손이다.");
    }
    if (obj2 instanceof Object) {
      System.out.println("obj2은 Object의 자손이다.");
    }
  }
}
