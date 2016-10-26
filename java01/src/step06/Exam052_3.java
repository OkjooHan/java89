package step06;

public class Exam052_3 {
  static void printStarsLine(int length) {
    int count = 0;
    while (count++ < length) {
      System.out.print("*");
    }
    System.out.println();
  }

  static void printCenterStarsLine(int lineSize, int starLength) {

    if (starLength > lineSize) {
      starLength = lineSize;
    }
    if (lineSize % 2 == 0) {
      lineSize++;
    }
    // if (starLength % 2 == 0) {
    //   starLength++;
    // }
    printBlanks(getBlankSize(lineSize, starLength));
    printStarsLine(starLength);
    // while (starLength-- > 0) {
    //   System.out.print("*");
    // }
    // System.out.println();
  }

  static int getBlankSize(int lineSize, int starLength) {
    return (lineSize - starLength) / 2;
  }

  static void printBlanks(int length) {
    while (length-- > 0) {
      System.out.print(" ");
    }
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
