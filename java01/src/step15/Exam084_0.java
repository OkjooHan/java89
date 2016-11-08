/* 상속 - super() : 수퍼클래스의 생성자를 반드시 명시해야 할 경우
=> 수퍼클래스에 기본 생성자가 없을 때
*/
package step15;

public class Exam084_0 {
  //A 클래스는 기본 생성자가 없다.
  static class A {
    int v1;
    public A(int a) {
      //super();
      System.out.println("A()...");
      v1 = a;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      //여기에 수퍼클래스인 A의 기본생성자를 호출하는 코드가 자동으로 삽입된다.
      //super(); //바로 이것때문에 컴파일 오류가 발생한다.
      System.out.println("B()...");
      v2 = 200;
    }
  }

  static class C extends B {
    int v3;
    public C() {
      System.out.println("C()...");
      v3 = 300;
    }
  }

  public static void main(String[] args) {
    C obj = new C();
    System.out.println("--------------------------");  
  }
}