package step03;

public class Exam035 {
  // class 문법을 사용하여 메모리 묶음을 선언한다.
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    //1) 인스전스 준비
    //=> 클래스에 정의됨 대로 메모리 준비하기
    //=> 이렇게 준비한 복합 메모리를 '인스턴스(instance)'라 부른다.
    Score s1 = new Score();
    Score s2 = new Score();

    //2) 복합 메모리에 값 넣기
    //인스턴스이름.내부메모리의이름
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3;

    //3) 복합 메모리의 값 꺼내기
    System.out.println(s1.name);
    System.out.println(s1.kor);
    System.out.println(s1.eng);
    System.out.println(s1.math);
    System.out.println(s1.sum);
    System.out.println(s1.aver);
  }
}
