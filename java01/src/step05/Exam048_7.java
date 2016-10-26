/*
=> 다음과 같이 구구단을 출력하라.
2 * 1 = 2
2 * 2 = 4
....
2 * 9 = 18

3 * 1 = 3
...
9 * 9 = 81
*/

package step05;

public class Exam048_7 {
  public static void main(String[] args) {
    int a = 1, b = 0;

    while (a++ < 9) {
      //System.out.println("a=" + a);
      System.out.println(a + "단");
      while (b++ < 9) {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
      }
      b = 0;
      System.out.println();
    }
  }
}

/*
#코딩 순서
1) 1~5까지 반복하는 while 문을 작성하라.
   반복할 때마다 현재의 숫자를 출력하라.
2) '*' 문자를 찍는 반복문을 안에 작성한다.
*/
