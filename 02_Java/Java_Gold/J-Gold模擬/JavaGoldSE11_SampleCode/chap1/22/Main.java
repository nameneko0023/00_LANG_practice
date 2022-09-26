interface A {
  void method(); // 抽象メソッド
}
interface X extends A { // Aインタフェースのサブインタフェース
  @Override
  default void method() { System.out.println("X"); }
}
class Y implements A { // Aインタフェースの実装クラス
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
