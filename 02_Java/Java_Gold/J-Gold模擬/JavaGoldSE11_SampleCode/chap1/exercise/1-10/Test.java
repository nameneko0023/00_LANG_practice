interface MyInterA {
  default void print() { System.out.println("MyInterA"); }
  private void test() { System.out.println("test("); }
}
interface MyInterB {
  void show();
  private void calc() { System.out.println("calc"); }
  default void print() { System.out.println("MyInterB"); }
}
interface MyInterC extends MyInterA, MyInterB {
  void write();
  default void print(String s) { 
      System.out.println("MyInterC"); }
  private void calc() { System.out.println(); }
}
  