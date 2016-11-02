package step11;

public class Exam073_3 {
  static class A {
    int v1;
    void m1(String value, int value2) {
      System.out.printf("A.m1()\n");
    }
  }
  static class B extends A {
    int v2;
    //다음과 같이 개발자가 잘못된 오버라이딩을 할 경우가 있다.
    //즉 오버라이딩(재정의)이 아니라 오버로딩(추가등록)이 된 경우다.
    //그러나 개발자는 올바르게 오버라이딩했다고 착각하고 사용할 수 있다.
    //그래서 이것을 막는 문법이 등장하였다.
    //컴파일러에게 오버라이딩이 맞는지 검사하는 방법이다.
    //애노테이션이라는 특별한 주석을 사용하여 컴파일러에게 명령을 내려보자!
    @Override
    void m1(int value2, String value) {
      System.out.println("B.m1()");
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.m1("haha", 10);
  }
}
