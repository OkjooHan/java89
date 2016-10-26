package step06;

public class Exam054_3 {
  static void score(int[] values, String name) {
    int sum = 0;
    for (int v : values) {
      sum += v;
    }
    System.out.printf("%s님의 총점은 %d입니다.\n", name, sum);
  }

  // static void score2(int... values, String name) {
  static void score2(String name, int... values) {
    int sum = 0;
    for (int v : values) {
      sum += v;
    }
    System.out.printf("%s님의 총점은 %d입니다.\n", name, sum);
  }

  public static void main(String[] args) {
    score(new int[]{100, 90, 80}, "홍길동");
    //score2(new int[]{100, 90, 80}, "임꺽정");
    score2("임꺽정", 100, 90, 80);
  }
}
