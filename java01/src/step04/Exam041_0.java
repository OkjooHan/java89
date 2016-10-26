package step04;

public class Exam041_0 {
  public static void main(String[] args) {
    int age = 10;
    // (조건) ? A : B;
    //=> A와 B는 결과를 리턴하는 명령어 이어야 한다. "Expression(표현식)"

    //컴파일 오류
    //(10 < 29) ? System.out.println("미성년") : System.out.println("성년")

    String result = (age < 29) ? "미성년" : "성년";
    System.out.println(result);
  }
}
