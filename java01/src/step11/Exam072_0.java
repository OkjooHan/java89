package step11;

public class Exam072_0 {
  static class 포유류 {
    int v1;
    void m1() {
      System.out.println("포유류.m1()");
    }
  }
  static class 유인원 extends 포유류 {
    int v2;
    void m2() {
      System.out.println("유인원.m2()");
    }
  }
  static class 사람 extends 유인원 {
    int v3;
    void m3() {
      System.out.println("사람.m3()");
    }
  }

  public static void main(String[] args) {
    포유류 a1 = new 포유류(); //ok
    포유류 a2 = new 유인원(); //ok
    포유류 a3 = new 사람(); //ok

  //  유인원 b1 = new 포유류(); //컴파일 오류
    유인원 b2 = new 유인원(); //ok
    유인원 b3 = new 사람(); //ok

    //사람 c1 = new 포유류(); //컴파일 오류
    //사람 c2 = new 유인원(); //컴파일 오류
    사람 c3 = new 사람(); //ok
  }
}
