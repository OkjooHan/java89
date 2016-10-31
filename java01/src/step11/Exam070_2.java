package step11;

public class Exam070_2 {
  static class A {
    int v1;
  }
  static class B extends A {
    int v2;
  }
  static class X extends A {
    int vx;
  }
  static class C extends B {
    int v3;
  }


  public static void main(String[] args) {
    /*
    C obj = new C();
    obj.v3 = 100;
    System.out.println(obj.v3);

    obj.v2 = 200;
    System.out.println(obj.v2);

    obj.v1 = 300;
    System.out.println(obj.v1);
    */
    //obj.vx = 500; //컴파일 오류! 설계도는 반드시 직계 조상만 참조한다.
                  //X 클래스는 C의 직계 조상이 아니다.

    B obj = new B(); //v1, v2 인스턴스변수 준비
    obj.v1 = 100;
    obj.v2 = 200;
    obj.v3 = 300; //컴파일 오류!
  }
}
