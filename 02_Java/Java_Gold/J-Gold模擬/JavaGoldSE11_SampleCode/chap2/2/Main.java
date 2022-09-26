class Parent {
  void bar() { // メソッド名が「bar」
    System.out.println("Parent#bar()");
  }
}
class Child extends Parent {
  @Override
  void bal() { // メソッド名が「bal」
    System.out.println("Child#bar()");
  }
}
public class Main {
  public static void main(String[] args) {
    new Child().bar();
  }
}
