package step03;

public class Exam033_2 {
  public static void main(String[] args) {
    //1) 배열에 값 저장하기
    int[] scores = new int[3];
    scores[0] = 100; //배열 메모리의 번호(index)는 0번부터 시작한다.
    scores[1] = 100;
    scores[2] = 100;

    //배열의 인덱스 범위를 벗어나면 실행 오류 발생
    //scores[3] = 100; //배열의 인덱스 범위는 0 ~ (length-1)

    //주의!
    //배열을 만들지 않고 단지 배열 이름 변수만 선언한 다음에 사용하면 오류!
    int[] scores2;
    //scores2[0] = 100;

    //2) 배열 변수 선언과 함꼐 값을 저장하기
    int[] scores3 = new int[]{80, 70, 90}; //중괄호에 나열된 값 갯수만큼 배열 생성
    System.out.println(scores3[2]);

    //3) 배열 변수 선언과 배열을 초기화시키는 명령을 분리할 수 있다.
    int[] scores4;
    scores4 = new int[] {40, 50, 60}; //ok!

    //4) 배열 변수 선언과 함꼐 값을 저장할 때 new int[]명령을 생략할 수 있다.
    //변수 선언에 어떤 종류의 메모리인지 지정되어 있기 때문에 생략이 가능한 것이다.
    int[] scores5 = {10, 20, 30};
    System.out.println(scores5[1]);

    //주의 1) 배열 변수 선언과 값을 초기화시키는 명령이 분리되었을 때는
    //new int[] 생략이 불가능하다.
    int[] scores6;
    //scores5 = {40, 50, 60}; //컴파일 오류
    //System.out.println(scores5[0]);

    //배열 변수를 선언하고 따로 초기화 시킬 때는 반드시 new int[]가 존재해야 한다.
    scores6 = new int[] {40, 50, 60};

    //주의 2) 배열 선언할 때 값을 초기화시키는 명령이 있으면 배열 개수를 지정할 수 없다.
    //초기화 명령({값, 값,...})에서 메모리 개수를 자동계산 할 수 있기 때문이다.
    //int[] scores7 = new int[3] {100, 100, 100}; //컴파일 오류
    int[] scores7 = new int[] {100, 100, 100};

  }
}
