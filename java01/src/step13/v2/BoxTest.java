/* 값을 저장할 때 사용할 메모리를 정의한다.*/
package step13.v2;

import java.util.Scanner;

public class BoxTest {
  static Scanner keyScan;
  static Box head;
  static Box tail;
  static Box cursor;

  static{
    keyScan  = new Scanner(System.in);
  }

  public static void main(String[] args) {

    loop:
    while (true) {
      System.out.printf("[add]:추가 / [list]:전체보기 / [get]:인덱스보기 / [quit]:나가기\n명령> ");
      switch(keyScan.nextLine()) {
      case "add": doAdd(); break;
      case "list": doList(); break;
      case "get":
        doGet();
        break;
      case "quit": System.out.println("Bye!"); break loop;
      default:
        System.out.println("올바른 명령어가 아닙니다. 다시 입력해주세요.");
      }
    }
  }

  static void doAdd() {
    System.out.printf("입력할 값? ");
    Box b = new Box(Integer.parseInt(keyScan.nextLine()));
    if (head == null) {head = b;}
    if (tail == null) {tail = b;}
    else {
      tail.next = b;
      tail = b;
    }
  }

  static void doList() {
    cursor = head;
    while (cursor != null) {
      System.out.print(cursor.toString());
      if (cursor != tail) System.out.print(" - ");
      cursor = cursor.next;
    }
    System.out.println();
  }

  static void doGet() {
    System.out.print("인덱스? ");
    cursor = head;
    int index = Integer.parseInt(keyScan.nextLine());
    for (int i = 1; i <= index; i++) {
      if (cursor.next == null) {
        System.out.println("입력 범위를 초과했습니다.");
        return;
      }
      cursor = cursor.next;
    }
    System.out.println(cursor.toString());
  }
}
