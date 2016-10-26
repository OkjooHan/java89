package step05;

public class Exam045_7 {
  public static void main(String[] args) {
    int a = 100;
    m1(a);
    System.out.println("main: " + a);

    m1(a);
    System.out.println("main: " + a);

    m1(a);
    System.out.println("main: " + a);
  }

  static void m1(int a) {
    System.out.println("m1: " + a);
    a = 300;
  }
}
