/*
Quiz!
클래스 문법을 이용하여 수강생 정보를 저장하고 출력하라.
*/
package step03.test;

public class Test4 {
  static class Student {
    //String className; //과정명
    String name; //수강생 이름
    int age; //수강생 나이
    int postno; //우편번호
    String baseAddress; //주소
    String detailAddress;
    String school;
    boolean working;
    String tel; //전화번호
    String email;

  }

  public static void main(String[] args) {
    Student s1 = new Student();

    //std.className = "Java&DB 프로그래밍 과정";
    s1.name = "홍길동";
    s1.age = 20;
    s1.postno = 76271;
    s1.baseAddress = "경기도";
    s1.detailAddress = "상갈동";
    s1.school = "비트대학교";
    s1.working = false;
    s1.tel = "1111-1111";
    s1.email = "hong@bit.com";

    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.postno);
    System.out.println(s1.baseAddress);
    System.out.println(s1.detailAddress);
    System.out.println(s1.school);
  }

}
