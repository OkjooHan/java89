/* 주제 : HashMap과 Hashtable 차이점
=> null 허용 여부 : HashMap(ok), Hashtable(x)
=> 동기화 : HashMap(x), Hashtable(ok)
*/

package step17;

import java.util.*;
import java.util.Map.Entry;

public class Exam093_0 {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    
    map.put("s001", "홍길동");
    map.put("s002", null);
    map.put(null, "유관순");
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");

    System.out.println(map.get("s002"));
    System.out.println(map.get(null));
    System.out.println("-----------------------------");

    Hashtable<String, String> map2 = new Hashtable<String, String>();
    
    map2.put("s001", "홍길동");
    //map2.put("s002", null); //실행 오류!
    //map2.put(null, "유관순"); //실행 오류!
    map2.put("s004", "안중근");
    map2.put("s005", "윤봉길");

    System.out.println(map2.get("s002"));
    //System.out.println(map2.get(null)); //실행 오류!
  }
}