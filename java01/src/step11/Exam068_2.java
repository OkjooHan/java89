package step11;

import java.util.Scanner;

public class Exam068_2 {
  public static void main(String[] args) {
    MyCalculator calc = new MyCalculator();
    //7 - 5 ** 4 % 3= 1
    calc.plus(7);
    calc.minus(5);
    calc.power(4);
    calc.remainder(3);
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
