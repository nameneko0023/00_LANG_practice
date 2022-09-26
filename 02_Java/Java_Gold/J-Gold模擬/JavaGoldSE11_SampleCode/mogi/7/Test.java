interface X {
  default void methodA() { System.out.println("X"); }
}
interface Y {
  default void methodA() { System.out.println("Y"); }
  public abstract void methodB();
}
interface Z extends X, Y {
  void methodC(int a, int b);
}
