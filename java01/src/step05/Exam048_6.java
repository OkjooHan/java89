package step05;

public class Exam048_6 {
  public static void main(String[] args) {
    int count = 0, starCount = 0;
    while (count++ < 5) {
      while (starCount++ < count) {
        System.out.print("*");
      }
      System.out.println();
      starCount = 0;
    }

    count = 0;
    starCount = 0;
    while (count < 5) {
      while (starCount++ < 5 - count) {
        System.out.print("*");
      }
      System.out.println();
      count++;
      starCount = 0;
    }
  }
}

/*
#코딩 순서
1) 1~5까지 반복하는 while 문을 작성하라.
   반복할 때마다 현재의 숫자를 출력하라.
2) '*' 문자를 찍는 반복문을 안에 작성한다.
*/
