package step07;

public class Exam056_2 {
  public static void main(String[] args) {
    String s1 = new String("홍길동");
    String s2 = new String("홍길동");
    String s3 = new String("홍길동");

    if(s1 == s2) {
      System.out.println("s1 == s2");
    }
    if(s2 == s3) {
      System.out.println("s2 == s3");
    }
  }
}
