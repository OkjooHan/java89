package step11;

public class Exam071_3 {
  static class A {
    void m1() {System.out.printf("A.m1()\n");}
    void m2() {System.out.printf("A.m2()\n");}
  }
  static class B extends A {
    void m2() {System.out.printf("B.m2()\n");}
    void m3() {System.out.printf("B.m3()\n");}
  }
  static class C extends B {
    void m1() {System.out.printf("C.m1()\n");}
    void m2() {System.out.printf("C.m2()\n");}
    void m4() {System.out.printf("C.m4()\n");}
    void test1() {
      //super.m4(); //컴파일 오류! 조상 클래스들 중에 m4() 메서드가 없다.
      super.m1(); //A.m1()
      super.m2(); //B.m2()
      super.m3(); //B.m3()
      super.super.m2(); //?
    }
  }

  public static void main(String[] args) {
    C obj2 = new C();
    obj2.test1();
  }
}
