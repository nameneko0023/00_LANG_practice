interface Foo {
  static void method() { // �ÖٓI��public���t�^�����
    System.out.println("Foo : method()");
  }
}
public class Main {
  public static void main(String[] args) {
    Foo.method();
    //Foo obj = new Foo(); obj.method(); // �R���p�C���G���[
  }
}