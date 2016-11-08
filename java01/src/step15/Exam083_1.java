/* 상속 - super() : 수퍼클래스의 생성자 호출
=> 모든 생성자는 수퍼클래스의 기본 생성자를 호출하는 명령어(super())를 
   생성자 블록 첫 줄에 포함한다. 
   만약, 개발자가 이 명령어를 작성하지 않으면 컴파일러가 자동으로 추가한다. 
*/
package step15;

public class Exam083_1 {
  static class A {
    int v1;
    public A() {
      super();
      System.out.println("A()...");
      v1 = 100;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      super();
      System.out.println("B()...");
      v2 = 200;
    }
  }

  static class C extends B {
    int v3;
    public C() {
      //항상 첫 줄은 수퍼클래서의 기본생성자 호출 명령어가 있어야 한다.
      super();
      System.out.println("C()...");
      //super(); //첫 문장이 아니면 컴파일 오류 발생!
      v3 = 300;
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.println("--------------------------");

    B obj2 = new B();
    System.out.println("--------------------------");

    C obj3 = new C();
    System.out.println("--------------------------");  
  }
}