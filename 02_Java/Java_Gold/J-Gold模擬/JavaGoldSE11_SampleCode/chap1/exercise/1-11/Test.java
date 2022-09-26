public class Test {
  int num = 10;
  class Foo {
    static int num = 50;
    void show() { System.out.println(num); }
  }
  public static void main(String[] args) {
    Test obj = new Test();
    Test.Foo foo = obj.new Foo();
    foo.show();
  }
}
