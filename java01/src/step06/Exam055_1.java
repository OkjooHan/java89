package step06;

public class Exam055_1 {
  static void square(int value) {
    value *= value;
    System.out.println("square() : " + value);
  }
  public static void main(String[] args) {
    int value = 3;
    square(value);
    System.out.println("main() : " + value);
  }
}
