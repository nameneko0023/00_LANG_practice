interface MyInter { void methodA(); }
class Outer {
  void method() {
    MyInter obj = new MyInter() {
      public void methodA() {
        System.out.println("methodA()");
      }
    };
    obj.methodA(); // �����N���X�̃��\�b�h�Ăяo��
  }
}
public class Main {
  public static void main(String[] args) {
    new Outer().method();
  }
}
