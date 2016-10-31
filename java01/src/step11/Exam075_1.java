package step11;

public class Exam075_1 {
  static class A /*extends Object*/ {}
  static class B extends A /*extends Object*/ {}

  public static void main(String[] args) {
    A obj1 = new A();
    String str = obj1.toString();
    System.out.println(str);
  }
}
