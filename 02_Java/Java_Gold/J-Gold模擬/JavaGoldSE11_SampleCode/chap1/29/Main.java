interface MyInter { void methodA(); }
class Outer {
  void method() {
    new MyInter() {
      public void methodA() {
        System.out.println("methodA()");
      }
    }.methodA(); // �����N���X�̃��\�b�h�Ăяo��
  }
}
public class Main {
  public static void main(String[] args) {
    new Outer().method();
  }
}
