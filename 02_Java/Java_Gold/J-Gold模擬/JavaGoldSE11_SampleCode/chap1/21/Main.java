interface A {
  void method(); // 抽象メソッド
}
interface X extends A { // Aインタフェースのサブインタフェース
  @Override
  default void method() { System.out.println("X"); }
}
interface Y extends A { // Aインタフェースのサブインタフェース
  @Override
  default void method() { System.out.println("Y"); }
}
class MyClass implements X, Y {
  @Override
  public void method() { X.super.method(); }
}
public class Main {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.method();
  }
}
