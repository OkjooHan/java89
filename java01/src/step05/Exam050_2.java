package step05;

public class Exam050_2 {
  public static void main(String[] args) {
    int count = 0;
    for (count = 0; count < 3; count++) {
      System.out.printf("%d: 하하하\n", count);
    }

    System.out.println("----------");

    count = 0;
    for (; count < 3;) {
      System.out.printf("%d: 하하하\n", count);
      count++;
    }
    System.out.println("----------");

    count = 0;
    for (;;) { //무한루프
      if (count >= 3)
        break;
      System.out.printf("%d: 하하하\n", count);
      count++;
    }
    System.out.println("----------");
  }
}
