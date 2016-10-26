package step08;

public class Exam061_4 {
  static class Calculator {
    //스태틱 변수
    //=> 클래스를 실행할 때(로딩할 때) Method Area 영역에 자동으로 준비된다.
    //=> new라는 명령어에서는 제외된다.
    //=> 클래스에 한 개만 존재한다.
    static int sum = 0;
    static void plus(int a) {sum += a;}
    static void minus(int a) {sum -= a;}
    static void multiple(int a) {sum *= a;}
    static void divide(int a) {sum /= a;}
  }

  public static void main(String[] args) {
    //계싼 수행(연산자 우선순위 고려하지 않는다);
    //만약에 두 개의 계산을 동시에 실행한다면?
    //=> 3 + 2 * 3 - 1 = 14;
    //=> 4 * 5 - 7 / 2 = 6

    //Calculator 클래스에 sum이라는 변수가 오직 한 개만 있기 때문에
    //동시에 여러 계산을 진행할 수 없다.
    //무조건 계산식을 차례대로 실행해야 한다.
    Calculator.plus(3);
    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.minus(1);
    System.out.println(Calculator.sum);

    Calculator.sum = 0;

    Calculator.plus(4);
    Calculator.multiple(5);
    Calculator.minus(7);
    Calculator.divide(2);

    System.out.println(Calculator.sum);
  }
}
