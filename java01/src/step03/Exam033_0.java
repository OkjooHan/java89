package step03;

public class Exam033_0 {
  public static void main(String[] args) {
    //1) 낱개로 변수를 선언하기
    int kor;
    int eng;
    int math;

    //2) 같은 종류의 변수는 묶어서 선언할 수 있다.
    int age, weight, height;

    //3) 같은 종류의 변수는 한 가지 이름으로 여러 개 선언할 수 있다.
    //int score[3]; //안타깝게도 자바는 이 문법을 지원하지 않는다. c언어에서 가능!
    int[] scores = new int[3]; //<---"Array(배열)"이라 부른다.
    int scores2[] = new int[3]; //자바는 int[] 변수명;을 많이 쓴다.
  }
}
