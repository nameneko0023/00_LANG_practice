@FunctionalInterface
interface FuncInter<T> {
  void foo(T t);   // ���ۃ��\�b�h
  String toString();          // Object�N���X��public���\�b�h
  boolean equals(Object obj); // Object�N���X��public���\�b�h
  static  void X() { };       // static���\�b�h
  default void Y() { };       // default���\�b�h
}