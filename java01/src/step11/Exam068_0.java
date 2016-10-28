package step11;

import java.util.Scanner;

public class Exam068_0 {
  public static void main(String[] args) {
    CalculatorHan calc = new CalculatorHan();
    //3 * 2 + 4 - 7 = 3
    calc.plus(3);
    calc.multiple(2);
    calc.plus(4);
    calc.minus(7);
    System.out.println(calc.result);
  }
}
