package step04;

public class Exam042_0 {
  public static void main(String[] args) {
    int a = 0b0110_1100;
    int b = 0b0011_0001;
    int c = a & b; //피연산자 정수 값이라면 &는 비트연산자로 동작한다.
    System.out.println(c);
    System.out.println(Integer.toString(c, 2));

    c = a | b;
    System.out.println(c);
    System.out.println(Integer.toString(c, 2));

    c = a ^ b;
    System.out.println(Integer.toString(c, 2));

    c = ~a;
    System.out.println(Integer.toString(c, 2));
  }
}
