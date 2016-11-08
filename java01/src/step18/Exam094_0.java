/* 주제 : 파일을 다루는 도구 - File 클래스 사용법
=> 파일 정보를 다루는 클래스
*/

package step18;

import java.io.File;

public class Exam094_0 {
  public static void main(String[] args) {
    //파일에 기본 경로는 JVM을 실행하는 폴더이다.
    //예) C:/workspace/java01/
    //=> 이렇게 기본 경로를 기준으로 파일의 경로를 작성하면,
    //   이것을 "상대경로"라 부른다.
    File f = new File("test.txt");

    //=> 다음과 같이 파일의 경로를 최상위 디렉토리부터 작성하면
    //   절대 경로라 부른다.
    //파일 경로에서 역슬래시를 쓸 경우 두 개를 써야 제대로 인식한다.
    //File f2 = new File("C:\\workspace\\java01\\test.txt");
    File f2 = new File("C:/workspace/java01/test.txt");

    //경로에 .. 기호를 사용하여 경로를 이동할 수 있다.
    //.. => 상위폴더
    //.  => 현재폴더
    File f3 = new File("../intro/Hello.java");
  }
}