package step04;

public class Exam037_3 {
  public static void main(String[] args) {
    int a = 10;
    int result = a++;
    System.out.printf("a=%d, result=%d\n", a, result);
    /* 실행순서
    1) a값을 그 자리에 둔다.
       => result = 10;
    2) a값을 1 증가시킨다.
       => a = 11;
    3) r-value쪽이 다 처리되었다. 할당 연산을 수행한다.
       => result <--- 10
    */

    a = 10;
    a = a++;
    System.out.println(a);

  }
}
