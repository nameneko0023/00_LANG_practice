class Outer { // �O���̃N���X
  private int val1 = 100; // �C���X�^���X�ϐ�
  private static int val2 = 200; // static�ϐ�
  class A { // ��static�N���X(�C���i�[�N���X)
    void method1() { // ��static���\�b�h
      System.out.println("A#method1()#instance val1 :" + val1);
      System.out.println("A#method1()#static val2   :" + val2); }
    //static void method2() { // static���\�b�h
      //System.out.println("A#method2()#instance val1 :" + val1);
      //System.out.println("A#method2()#static val2   :" + val2); }
  }
  static class B { // static�N���X
    void method1() { // ��static���\�b�h
      //System.out.println("B#method1()#instance val1 :" + val1);
      System.out.println("B#method1()#static val2   :" + val2); }
    static void method2() { // static���\�b�h
      //System.out.println("B#method2()#instance val1 :" + val1);
      System.out.println("B#method2()#static val2   :" + val2); }
  }
}
public class Main { // �O���̃N���X
  public static void main(String[] args) {
    Outer.A a = new Outer().new A(); // ��static�N���X�̃C���X�^���X��
    Outer.B b = new Outer.B(); // static�N���X�̃C���X�^���X��
    a.method1(); b.method2();
  }
}
