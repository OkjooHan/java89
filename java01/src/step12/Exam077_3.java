package step12;

import java.lang.reflect.Method;

public class Exam077_3 {
  //클래스 안에 메서드나 변수와 동등 레벨로 선언된 경우, 멤버 inner 클래스라고 한다.
  static class A {
    /*static Class class; <-- 모든 클래스는 무조건 이 변수를 내장하고 있다.*/
    String name;
    int age;

    public void m1() {System.out.println("hello");}
    protected void m2() {}
    void m3() {}
    private void m4() {}
  }

  public static void main(String[] args) throws Exception{
    Class clazz = A.class;

    //1) 클래스의 메서드 목록을 얻는다.
    // => 그 클래스의 메서드 및 수퍼 클래서의 메서드를 추출한다.
    //    단, public 접근 범위를 갖는 메서드만 추출한다.
    Method[] methods = clazz.getMethods();

    //2) 반복문을 통해 메서드 이름을 알아낸다.
    for (Method method : methods) {
      System.out.println(method.getName());
    }
    System.out.println("-----------------------");

    //=> 수퍼 클래스의 메서드를 제외하는 대신
    //   그 클래스의 모든 접근 범위의 메서드를 추출한다.
    Method[] methods2 = clazz.getDeclaredMethods();

    for (Method method : methods2) {
      System.out.println(method.getName());
    }
  }
}
/*

*/
