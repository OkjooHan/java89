/* 주제 : 인스턴스 변수에 직접 접근했을 때 발생되는 문제 II

*/
package step16.ex1;

public class ScoreTest {
  public static void main(String[] args) {
    Score score = new Score("홍길동", 100, 90, 80);
    score.sum = 200;
    System.out.printf("합계: %d, 평균: %f\n", score.sum, score.aver);
  }
}