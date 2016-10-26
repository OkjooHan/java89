package step05;

public class Exam048_2 {
  public static void main(String[] args) {
    int stopNo = Integer.parseInt(args[0]);
    int count = 0;
    while (true) {
      if (count > stopNo)
        break;
      System.out.println(count++ + " 하하하");
    }
  }
}
