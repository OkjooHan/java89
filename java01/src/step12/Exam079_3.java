/* 주제 : 랩퍼(Wrapper) 클래스 - boxing과 파라미터
*/
package step12;

public class Exam079_3 {
  static void m1(Object value) {
    System.out.println(value);
  }
  static void m2(int value) {
    System.out.println(value);
  }

  public static void main(String[] args) throws Exception{
    m1(new Integer(100));
    m1(200); //오토박싱 = m1(new Integer(200));
    m2(300);
    Integer obj = new Integer(400);
    m2(obj); //오토언박싱 = m2(obj.intValue());
    //m2("500"); //컴파일 오류!
    Float obj2 = new Float(3.14);
    m1(obj2);

    Textbook t = new Textbook();
    m1(t);
  }
}
/*

*/
