package step09;

import java.util.Scanner;

public class Exam062_0 {
  public static void main(String[] args) {
    //1) 키보드로부터 입력된 데이터를 우리가 원하는 형식으로 잘라주는 도구 준비
    Scanner keyScan = new Scanner(System.in);

    //2) 사용자가 입력한 값을 줄 단위로 자른다.
    String str = keyScan.nextLine(); //리턴 값은 한 줄 문자열(이 저장된 인스턴스의 주소)이다.

    System.out.printf("=> %s\n", str);
  }
}
