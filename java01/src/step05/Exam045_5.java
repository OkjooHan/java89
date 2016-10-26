package step05;

public class Exam045_5 {
  static int a = 20; //<---클래스 변수(스태틱 변수)
  int x = 100; //<---인스턴스 변수
  public static void main(String[] args /*<---파라미터(로컬 변수)*/) {
    //int args = 20;
  }

  static void m1(int a /*<---파라미터(로컬 변수)*/) {
    int b; //<---로컨 변수
    {
      int c; //<---로컬 변수
    }
  }
}
