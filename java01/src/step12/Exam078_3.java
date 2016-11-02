/* 주제 : String 클래스 - 인스턴스를 constants Pool에 생성하기

*/
package step12;

public class Exam078_3 {
  public static void main(String[] args) throws Exception{
    String s1 = new String("Hello"); //heap 인스턴스 존재
    String s2 = s1.intern(); //상수풀에 String 인스턴스 생성
                             //만약 이미 상수풀에 그 값을 갖는 String이 있다면,
                             //기존 Stirng의 인스턴스 주소를 리턴한다.
    String s3 = "Hello"; //이미 위에서 상수풀에 "Hello" String을 만들었다.
                         //따라서, s3에는 이전에 생성된 인스턴스 주소가 리턴된다.
    //주소는 다르다
    if (s1 != s2) System.out.println("s1 != s2");
    if (s2 == s3) System.out.println("s2 == s3");
  }
}
/*

*/
