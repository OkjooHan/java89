public class Exam012 {
  public static void main(String[] args) {
    int value = java.lang.Math.abs(-200);
    System.out.print(value + "\n");

    // 1970.1.1 00:00:00부터 현재까지 경과된 시간을 밀리초로 리턴한다.
    long millis = System.currentTimeMillis();
    System.out.print(millis + "\n");
  }

  static void greeting() {
    System.out.print("안녕하쥬~~\n");
  }
}
