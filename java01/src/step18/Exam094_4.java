/* 주제 : 파일을 다루는 도구 - 디렉토리의 파일 목록 뽑아내기
*/

package step18;

import java.io.File;

public class Exam094_4 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_3 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }
    //f1의 디렉토리에 들어있는 파일 정보(디렉토리 포함)를 가져온다.
    String[] files = f1.list();
    for (String fileName : files) {
      File findFile = new File(f1.getPath() + "/" + fileName);
      // if (findFile.isDirectory()) {
      //   System.out.println("d " + fileName);
      // } else {
      //   System.out.println("- " + fileName);
      // }
      System.out.printf("%s %-10d %s\n", 
        (findFile.isDirectory()) ? "d " : "- ",
        findFile.length(),
        fileName);
    }    
  }
}