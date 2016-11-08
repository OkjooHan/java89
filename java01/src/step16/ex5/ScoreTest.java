/* 주제 : 인스턴스 변수에 직접 접근했을 때 발생되는 문제 II

*/
package step16.ex5;

public class ScoreTest {
  public static void main(String[] args) {
    Score score = new Score("홍길동", 100, 90, 80);
    //score.sum = 200;
    //score.kor = 0; 
    System.out.printf("합계: %d, 평균: %f\n", score.getSum(), score.getAverage());

    score.setKor(70);
    System.out.printf("합계: %d, 평균: %f\n", score.getSum(), score.getAverage());
  }
}