package step11;

import java.util.Scanner;

public class Exam068_1 {
  public static void main(String[] args) {
    ZCalculator calc = new ZCalculator();
    //3 * 2 + 4 - 7 = 3
    calc.plus(3);
    calc.multiple(2);
    calc.plus(4);
    calc.minus(7);
    System.out.println(calc.result);
  }
}

/*
# 다른 jar 파일에 있는 클래스 사용하기
=> 컴파일 할 때 .jar 파일을 classpath에 추가해야 한다.
예) javac -encoding utf8 -d bin -sourcepath srf -classpath libs/zc.jar src/step11/Exam068_1.java
=> 실행
.jar 파일을 추가해줘야 한다.
예)
windows => java -cp "bin;libs/zc.jar" step11.Exam068_1
mac     => java -cp bin:libs/zc.jar step11.Exam068_1
*/
