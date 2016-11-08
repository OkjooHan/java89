/* 주제 : 예외 처리 - 사용자 정의 예외 클래스 만들기
*/
package step14;

import java.io.*;

public class Exam082_0 {
  //사용자 정의 예외 클래스 만들기
  //[수퍼클래스의 선택]
  //1) Exception => 메서드 호출자에게 예외처리를 강제시키고 싶을 때
  //2) RuntimeException => 스텔스모드로 예외를 던지고 싶을 때
  static class NegativeNumberException extends Exception {
    public NegativeNumberException() {}
    public NegativeNumberException(String message) {
      super(message);
    }
  }
  static void m1(int a) throws Exception, IOException, NegativeNumberException {
    if (a == 0)
      throw new FileNotFoundException("예외1");
    else if (a == 1)
      throw new EOFException("예외2");
    else if (a == 2) 
      throw new IOException("예외3");
    else if (a < 0)
      throw new NegativeNumberException();
    else
      throw new Exception("예외4");
  }

  public static void main(String[] args) throws Exception{
    m1(-10);
  }
}
