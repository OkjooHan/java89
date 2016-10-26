//구구단 출력
package step05;

public class Exam050_6 {
  public static void main(String[] args) {
    
    for (int i = 2; i < 10; i++) {
      System.out.println(i + "단");
      for (int j = 1; j < 10 ; j++){
        System.out.println(i + " * " + j + " = " + i * j);
      }
      System.out.println();
    }

    /*
    for (int i = 2, j = 1; i < 10; i++, j++) {
      System.out.println(i + " * " + j + " = " + i * j);
    }
    System.out.println();
    */
  }
}
