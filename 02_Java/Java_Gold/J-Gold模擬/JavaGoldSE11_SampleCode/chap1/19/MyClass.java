interface A {
  void method(); // ���ۃ��\�b�h
}
interface X extends A { // A�C���^�t�F�[�X�̃T�u�C���^�t�F�[�X
  @Override
  default void method() { System.out.println("X"); }
}
interface Y extends A { // A�C���^�t�F�[�X�̃T�u�C���^�t�F�[�X
  @Override
  default void method() { System.out.println("Y"); }
}
class MyClass implements X, Y { } // ���̃N���X�������ŃR���p�C���G���[
