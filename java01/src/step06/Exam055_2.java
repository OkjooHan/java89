package step06;

public class Exam055_2 {
  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): %d, %d\n", a, b);
  }
  public static void main(String[] args) {
    int a = 3, b = 5;
    swap(a, b);
    System.out.printf("main[]: %d, %d\n", a, b);
  }
}
