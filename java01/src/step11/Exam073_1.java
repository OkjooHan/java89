package step11;

public class Exam073_1 {
  static class A {
    int v1;
    void m1(String value, int value2) {
      v1 = 100;
      System.out.printf("A.m1()\n");
    }
  }
  static class B extends A {
    int v2;
    /*OK
    void m1(String v, int v2) {
    this.v1 = 200;
    this.v2 = 200;
    System.out.printf("B.m1()\n");
    }
    */
    /*컴파일 오류 : 리턴 타입이 같아야 한다.
    int m1(String value, int value2) {
      v1 = 200;
      v2 = 200;
      System.out.println("B.m1()");
    }
    */
    /* 컴파일 ok : 오버라이딩 아님. 그냥 메서드 추가한거임 => 오버로딩임!
       오버라이딩 하려면 반드시 순서가 일치해야한다.
    int m1(int value, String value2) {
      v1 = 200;
      v2 = 200;
      System.out.println("B.m1()");
    }
    */
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.m1("2000");
    System.out.println(obj.v1);
    System.out.println(obj.v2);
  }
}
