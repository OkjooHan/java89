package step04;

public class Exam036_3 {
  public static void main(String[] args) {
    int a = 10, b = 7;

    //1) 명시적 형변환 전
    float result = (float)a / b;
    System.out.println(result);

    //2) 명시적 형변환 후
    result = a / (float)b;
    System.out.println(result);

    int v1 = 100;
    long v2 = 200;
    //int result2 = v1 + v2;
    //System.out.println(result2);

  }
}
