class Parent {
  void bar() { // ���\�b�h�����ubar�v
    System.out.println("Parent#bar()");
  }
}
class Child extends Parent {
  @Override
  void bal() { // ���\�b�h�����ubal�v
    System.out.println("Child#bar()");
  }
}
public class Main {
  public static void main(String[] args) {
    new Child().bar();
  }
}
