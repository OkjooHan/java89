package step11;

public class Exam074_0 {
  static class A {
    int result;
    void plus(int value) {
      result += value;
    }
  }
  static class B extends A {
    void minus(int value) {
      result -= value;
    }
    void plus(int value1, int value2) {
      this.result += value1 + value2;
    }
    void minus(int value1, int value2) {
      result -= value1 - value2;
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.plus(10);
    obj.plus(10, 20);
    obj.minus(10);
    obj.minus(10, 20);
    obj.minus(10, 20, 30);
  }
}
