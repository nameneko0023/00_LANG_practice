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
class MyClass implements X, Y { } // このクラスが原因でコンパイルエラー
