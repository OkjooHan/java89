package step09.ex04;

import java.util.Scanner;

public class EduApp {
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    TextbookController.keyScan = keyScan;
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    loop:
    while(true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();

      switch (command) {
      case "add": TextbookController.doAdd(); break;
      case "list": TextbookController.doList(); break;
      case "view": TextbookController.doView(); break;
      case "quit":
        System.out.println("안녕!");
        break loop;
      default:
        System.out.println("지원하지 않는 명령어입니다.");
        break;
      }
    }
  }
}
