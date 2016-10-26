package step06;

public class Exam052_2 {
  static void printStarsLine(int length) {
    int count = 0;
    while (count++ < length) {
      System.out.print("*");
    }
    System.out.println();
  }

  static void printCenterStarsLine(int lineSize, int starLength) {
    // 별 갯수가 줄 길이보다 크면 줄 갯수만큼만 출력
    if (starLength > lineSize) {
      starLength = lineSize;
    }
    // 줄 길이가 짝수면 1을 더하여 홀수로 만든다
    if (lineSize % 2 == 0) {
      lineSize++;
    }
    // 별 갯수가 짝수면 1을 더하여 홀수로 만든다
    // if (starLength % 2 == 0) {
    //   starLength++;
    // }
    // 공백 갯수
    int spaceCount = 0; //공백 갯수
    //System.out.println(lineSize + ", " + starLength);
    spaceCount = (lineSize - starLength) / 2;

    while (spaceCount-- > 0) {
      System.out.print(" ");
    }
    while (starLength-- > 0) {
      System.out.print("*");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    int count = 6;
    while (--count > 0) {
      printStarsLine(count);
    }

    System.out.println("123456789012345");

    for (int i = 1; i <= 9; i += 2) {
      printCenterStarsLine(9, i);
    }
    //printCenterStarsLine(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
  }
}
