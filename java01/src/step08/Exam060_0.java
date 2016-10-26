package step08;

public class Exam060_0 {
  public static void main(String[] args) {
    Student[] arr = new Student[3];

    //인스턴스를 생성할 때 바로 내가 지정한 값으로 메모리를 설정하고 싶다.
    // arr[0] = new Student();
    // arr[1] = new Student();
    // arr[2] = new Student();
    //
    // arr[0].init("홍길동", "hong@test.com", "111-1111", 20, true);
    // arr[1].init("임꺽정", "leem@test.com", "111-1112", 30, false);
    // arr[2].init("유관순", "you@test.com", "111-1113", 40, true);

    //인스턴스를 생성할 때 값을 넘겨주면,
    //그 값을 받을 수 있는 생성자를 찾아 호출한다.
    //만약 그 값을 받을 수 없는 생성자를 못 찾으면 컴파일 오류가 발생한다.
    arr[0] = new Student("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1] = new Student("임꺽정", "leem@test.com", "111-1112", 30, false);
    arr[2] = new Student("유관순", "you@test.com", "111-1113", 40, true);

    for (Student student : arr) {
      student.printStudent();
    }
  }
}
