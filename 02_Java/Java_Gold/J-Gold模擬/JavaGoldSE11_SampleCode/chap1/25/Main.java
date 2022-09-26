public class Main {  // �O���̃N���X
  class A {  // ��static �N���X
    void methodA() {System.out.println("methodA()"); }
  }
  static class B {  // static�N���X
    static void methodB() {System.out.println("methodB()"); }
  }
  public static void main(String[] args) {
    new Main().new A().methodA(); // new A().methodA(); ��NG
    new Main.B().methodB();  // new B().methodB(); �ł�OK
    Main.B.methodB();        // B.methodB(); �ł�OK
  }
}
