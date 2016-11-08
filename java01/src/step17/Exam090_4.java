/* 주제 : 컬렉션 클래스 HashSet - 사용자가 정의한 클래스에 대해 중복 저장 막기
=> 같은 값에 대해 같은 해시값을 리턴하도록 hashCode()메서드를 재정의하라.
=> 또한, 같은 값에 대해 true를 리턴하도록 equals()메서드도 재정의해야 한다.
*/

package step17;

import java.util.*;

public class Exam090_4 {
  public static void main(String[] args) {
    //hashCode() 메서드 재정의하기 전
    //=> 인스턴스가 다르면 해시값도 다르다.
    HashSet<Customer2> set = new HashSet<>();
    set.add(new Customer2("홍길동", 10, false));
    set.add(new Customer2("홍길동", 10, false));
    set.add(new Customer2("홍길동", 10, false));

    for (Customer2 value : set) {
      System.out.println(value.toString());
    }
  }
}