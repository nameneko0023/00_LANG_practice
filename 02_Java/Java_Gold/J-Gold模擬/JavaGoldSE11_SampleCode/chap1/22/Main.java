interface A {
  void method(); // ���ۃ��\�b�h
}
interface X extends A { // A�C���^�t�F�[�X�̃T�u�C���^�t�F�[�X
  @Override
  default void method() { System.out.println("X"); }
}
class Y implements A { // A�C���^�t�F�[�X�̎����N���X
  @Override
  public void method() { System.out.println("Y"); }
}
class MyClass extends Y implements X { }
  
public class Main {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.method();
  }
}
