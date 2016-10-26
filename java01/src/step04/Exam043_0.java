package step04;

public class Exam043_0 {
  public static void main(String[] args) {
    int a = 0b1100; //12
    //왼쪽이동                   //    1100 => 12
    System.out.println(a << 1); //   11000 => 24
    System.out.println(a << 2); //  110000 => 48
    System.out.println(a << 3); // 1100000 => 96
    System.out.println(a << 4); //11000000 => 192
  }
}
