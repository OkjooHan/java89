package step08;

public class Exam061_1 {
  public static void main(String[] args) {
    //계산 수행(연산자 우선순위 고려하지 않는다);
    //=> 3 + 2 * 3 - 1 = 14;
    //1) 각 메서드의 결과 값을 보관할 변수 준비
    int sum = 0;
    sum = plus(3, 2);
    sum = multiple(sum, 3);
    sum = minus(sum, 1);
    System.out.println(sum);
  }

  static int plus(int a, int b) {return a + b;}
  static int minus(int a, int b) {return a - b;}
  static int multiple(int a, int b) {return a * b;}
  static int divide(int a, int b) {return a / b;}
}
