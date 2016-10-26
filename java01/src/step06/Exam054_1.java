package step06;

public class Exam054_1 {
  static void greeting(String... names) {
    System.out.print("Hello, ");
    for (String name : names) {
      System.out.print(name + ", ");
    }
    System.out.println();

  }
  public static void main(String[] args) {
    greeting("홍길동");
    greeting("홍길동", "임꺽정");
    greeting("홍길동", "임꺽정", "유관순");
    greeting("홍길동", "임꺽정", "유관순", "안중근");
    greeting(new String[]{"홍길동", "임꺽정"});
  }
}
