/*
Quiz
프로그램 아규먼트로 두 개의 수를 입력 받아 둘 중 큰 수를 출력하시오.
=> 조건 연산자를 활용하라.
*/
package step04.test;

public class Test2 {
  public static void main(String[] args) {
    int v1 = Integer.parseInt(args[0]);
    int v2 = Integer.parseInt(args[1]);

    //int result = (v1 > v2) ? v1 : v2;
    //System.out.println(result);
    //System.out.println((v1 > v2) ? v1 : v2);
    System.out.println((v1 > v2) ? args[0] : args[1]);
  }
}
