package step05;

public class Exam048_1 {
  public static void main(String[] args) {
    int count = 0;
    while (count < 10) {
      System.out.println(count + " 하하하");
      count++;
    }

    System.out.println("----------");
    count = 0;
    while (count < 10) {
      System.out.println(count++ + " 하하하");
    }
  }
}
