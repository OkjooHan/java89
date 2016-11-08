/* 상속 - super() : 수퍼클래스의 생성자를 반드시 명시해야 할 경우
=> 수퍼클래스에 기본 생성자가 없을 때
*/
package step15;

public class Exam085_0 {
  static class A {
    int v1;
    public A() {
      System.out.println("A()...");
      v1 = 100;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      System.out.println("B()...");
      v2 = 200;
    }

    public void m1() {
      super(); //컴파일 오류
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    System.out.println("--------------------------");  
  }
}