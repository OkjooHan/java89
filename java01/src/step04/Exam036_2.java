package step04;

public class Exam036_2 {
  public static void main(String[] args) {
    int a = 10, b = 7;

    //1) 명시적 형변환 전
    float result = a / b; //암시적으로 b에 대해 float 형변환을 수행한다.
    //float result = a / b;
    System.out.println(result);

    //2) 명시적 형변환 후
    result = (float)a / (float)b;
    //result = (float)a / (float)b;
    System.out.println(result);
    System.out.println(a);
    System.out.println(b);

  }
}
