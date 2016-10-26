package step07;

public class Exam059_4 {
  public static void main(String[] args) {
    Student[] arr = new Student[3];

    //arr[0].name = "홍길동";
    arr[0] = new Student();
    arr[1] = new Student();
    arr[2] = new Student();

    init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
    init(arr[1], "임꺽정", "leem@test.com", "111-1112", 30, false);
    init(arr[2], "유관순", "you@test.com", "111-1113", 40, true);

    // arr[0].name = "홍길동";
    // arr[0].email = "hong@test.com";
    // arr[0].tel = "111-1111";
    // arr[0].age = 20;
    // arr[0].working = true;
    //
    // arr[1].name = "임꺽정";
    // arr[1].email = "leem@test.com";
    // arr[1].tel = "111-1112";
    // arr[1].age = 30;
    // arr[1].working = false;
    //
    // arr[2].name = "유관순";
    // arr[2].email = "you@test.com";
    // arr[2].tel = "111-1113";
    // arr[2].age = 40;
    // arr[2].working = true;

    //for (int i = 0; i < arr.length; i++) {
    for (Student student : arr) {
      printStudent(student);
    }
    // printStudent(arr[1]);
    // printStudent(arr[2]);
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.printf("%s, %s, %s, %d, %b\n",
    //                   arr[i].name, arr[i].email, arr[i].tel, arr[i].age, arr[i].working);
    // }
  }

  static void printStudent(Student student) {
    System.out.printf("%s, %s, %s, %d, %b\n",
                    student.name, student.email, student.tel,
                    student.age, student.working);
  }

  static void init(Student student, String name, String email, String tel,
                   int age, boolean working) {
    student.name = name;
    student.email = email;
    student.tel = tel;
    student.age = age;
    student.working = working;
  }

  static Student createStudent(String name, String email, String tel,
                               int age, boolean working) {
    Student student = new Student();
    student.name = name;
    student.email = email;
    student.tel = tel;
    student.age = age;
    student.working = working;

    return student;
  }
}
