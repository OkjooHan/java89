/*주제 : 람다 문법 익히ㅣ기
*/
package step18.ex3;

public class Test1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");

    /*
    class MyConsumer implements Consumer {
      public void execute(int index, Object value) {
        System.out.printf("%d: %s\n", index, (String)value);
      }
    }
    list.forEach(new MyConsumer());
    */

    //lambda 문법을 이용하여 계약서를 준수하는 클래스및 인스턴스롤 자동 생성하기 
    list.forEach((index, value) ->
      System.out.printf("%d *** %s \n", index, value));

    // list.forEach(new Aaa implements Consumer {
    //   @Override
    //   execute(int index, Object value ){
    //     System.out.printf("%d *** %s \n", index, value));
    //   }
    // })
  }
}