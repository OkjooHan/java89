/* 주제 : 예외 처리 - throw로 던질 수 있는 객체
*/
package step14;

import java.io.*;

public class Exam081_1 {
  static void m1() throws FileNotFoundException { 
    throw new FileNotFoundException("예외1");
  }

  static void m2() throws EOFException {
    throw new EOFException("예외2");
  }

  static void m3() throws IOException {
    throw new IOException("예외3");
  }

  static void m4() throws Exception {
    throw new Exception("예외4");
  }

  public static void main(String[] args) {
    try {
      m1(); m2(); m3(); m4();
    } catch (FileNotFoundException e) {
    } catch (EOFException e) {
    } catch (IOException e) {
    } catch (Exception e) {
    }

    try {
      m1(); m2(); m3(); m4();
    } catch (IOException e) {
    } catch (Exception e) {
    }

    try {
      m1(); m2(); m3(); m4();
    } catch (Throwable e) {
    }
  }
}
