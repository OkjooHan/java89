package step06;

public class Exam055_3 {
  static void swap(int[] values) {
    int temp = values[0];
    values[0] = values[1];
    values[1] = temp;
    System.out.printf("swap(): %d, %d\n", values[0], values[1]);
  }
  public static void main(String[] args) {
    int[] values = {10, 20};
    System.out.printf("main() 전: %d, %d\n", values[0], values[1]);
    swap(values);
    System.out.printf("main() 후: %d, %d\n", values[0], values[1]);
  }
}
