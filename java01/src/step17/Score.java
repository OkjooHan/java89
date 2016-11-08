/* 주제 : 셋터/겟터와 프로퍼티
=> 속성(attribute)란?
  - 인스턴스 변수(클래스 변수 포함)를 가리키는 용어.
  - 예) Score 클래스의 경우 : _name, _kor, _eng, _math, _sum, _aver 
=> 프로퍼티(property)?
  - 셋터와 겟터를 가리키는 용어.
  - 프로퍼티명은 메서드 이름에서 "set", "get", "is"를 제거하고 남은 이름 중에서
    첫 알파벳을 소문자로 한 이름.
  - 예) setName() --> "name", setFirstName() --> "firstName"
  - 예) Score 클래스의 경우 : 
        setKor()/getKor()   --> "kor"     : read/write 프로퍼티
        setEng()/getEng()   --> "eng"     : read/write 프로퍼티
        setMath()/getMath() --> "math"    : read/write 프로퍼티
        getSum()            --> "sum"     : read only 프로퍼티
        getAverage()        --> "average" : read only 프로퍼티
=> 프로퍼티명과 변수명은 다를 수 있다.
*/
package step17;

public class Score {
  private String _name;
  private int _kor;
  private int _eng;
  private int _math;
  private int _sum;
  private float _average;

  public Score(String _name, int _kor, int _eng, int _math) {
    this._name = _name;
    this._kor = _kor;
    this._eng = _eng;
    this._math = _math;
    this._sum = _kor + _eng + _math;
    this._average = this._sum / 3.0f;
  }
  
  //1) 셋터(setter)
  // => 접근이 제한된 변수에 값을 넣을 수 있도록 중재해주는 공개 메서드
  // => 메서드 명은 "set"으로 시작한다.
  // => "set" 다음의 이름은 단어 별로 첫 알파벳을 대문자로 한다.
  public void set_name(String _name) {this._name = _name;}
  public void set_kor(int _kor) {this._kor = _kor; this.compute();}
  public void set_eng(int _eng) {this._eng = _eng; this.compute();}
  public void set_math(int _math) {this._math = _math; this.compute();}

  //2) 겟터(getter)
  // => 접근이 제한된 변수의 값을 꺼낼 수 있도록 중재해주는 공개 메서드
  // => 메서드명은 "get"으로 시작한다.
  // => "get" 다음의 이름은 단어 별로 첫 알파벳을 대문자로 한다.
  // => 
  public int get_kor() {return this._kor;}
  public int get_eng() {return this._eng;}
  public int get_math() {return this._math;}
  public int get_sum() {return this._sum;}
  public float get_average() {return this._average;}
  private void compute() {this._sum = this._kor + this._eng + this._math; this._average = this._sum / 3f;}

  @Override
  public String toString() {
     return String.format("%s, %d, %d, %d, %d, %f",
       this._name,
       this._kor,
       this._eng,
       this._math,
       this._sum,
       this._average);
  }
}