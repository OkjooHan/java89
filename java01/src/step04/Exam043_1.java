package step04;

public class Exam043_1 {
  public static void main(String[] args) {
    int a = 0b1100; //12
    //오른쪽이동                 //    1100 => 12
    System.out.println(a >> 1); //     110 => 6
    System.out.println(a >> 2); //      11 => 3
    System.out.println(a >> 3); //       1 => 1
    System.out.println(a >> 4); //         => 0

    System.out.println("----------");
    int b = -12;
    System.out.println(b >> 1);
    System.out.println(b >> 2);
    System.out.println(b >> 3);
    System.out.println(b >> 4);
  }
}
