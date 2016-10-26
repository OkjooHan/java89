package step07;

public class Exam059_0 {
  public static void main(String[] args) {
    Student s1;
    Student s2;

    s1 = new Student();
    s2 = new Student();

    s1.name = "홍길동"; //주의! 값을 저장하는 것이 아니라 인스턴스 주소를 저장한다.
    s1.email = "hong@test.com";
    s1.tel = "111-1111";
    s1.age = 30;
    s1.working = true;

    s2.age = 20;
    s2.working = false;

    System.out.println(s1.name);
    System.out.println(s2.age);
  }
}
