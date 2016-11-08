/*주제 : 인터페이스 사용 후
*/
package step18.ex2;

public class Test1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");

    class MyConsumer implements Consumer {
      public void execute(int index, Object value) {
        System.out.printf("%d: %s\n", index, (String)value);
      }
    }
    list.forEach(new MyConsumer());
  }
}