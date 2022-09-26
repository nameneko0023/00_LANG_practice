public abstract class Test {
  String s1;
  public abstract void foo();
  public static void main(String[] args) {
    Test obj = new ExTest();
    obj.s1 = "hello"; obj.foo();
  }
  public static class ExTest extends Test {
    void foo() { System.out.println(s1); }
  }
}
