//주제: method 실행하기

public class Exam007 {

  public static void main(String[] args) {
    System.out.print("main\n");
    m1(); //메서드 호출하기
  }

  static void m1() {
    System.out.print("m1\n");
    System.out.print("안녕하세요.\n");
  }
}

/*
=> 메서드 실행 문법
  method_name(arguments, ...);
*/
