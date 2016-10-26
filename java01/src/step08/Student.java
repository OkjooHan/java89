package step08;

public class Student {
  String name;
  String email;
  String tel;
  int age;
  boolean working;

  //생성자
  //=> 리턴 타입 없음, 메서드 명이 클래스명과 동일함.
  //   리턴 타입이 없다고 void가 붙지 않는다. 이것이 생성자의 특수한 문법.
  //=> 인스턴트를 생성하는 동시에 값을 입력받는 것.
  //   Student s1;
  //   s1.Student("홍길동", "hong@test.com", "111-1111", 20. true); // 이거 안됨
  public Student(String name, String email, String tel, int age, boolean working) {
    this.name = name;
    this.email = email;
    this.tel = tel;
    this.age = age;
    this.working = working;
  }

  void printStudent() {
    System.out.printf("%s, %s, %s, %d, %b\n",
    this.name, this.email, this.tel, this.age, this.working);
  }
}
