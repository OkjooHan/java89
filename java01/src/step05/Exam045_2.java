package step05;

public class Exam045_2 {
  public static void main(String[] args) {
    int a = 10;
    {
      int b = 20;
      a = 20; //당연히 안쪽 블록에서는 바깥 블록변수를 마음대로 사용할 수 있다.

      //int a = 30; //메서드 안에서 변수 이름은 중복될 수 없다.
      //String a = "Hello"; //타입에 상관없이 같은 이름의 변수를 만들 수 없다.
    }

    {
      int b = 300; //이전 블록에서 선언된 변수는 이미 제거되었기 때문에 다시 선언 가능.
    }
  }
}
