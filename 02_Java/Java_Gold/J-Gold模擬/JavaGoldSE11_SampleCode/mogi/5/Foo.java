public class Foo {
  static class X {
    public void method() { System.out.println("X"); } }
  static class Y extends X {
    public void method() { System.out.println("Y"); } }
  static class Z extends X {
    public void method() { System.out.println("Z"); } }
  public static void main(String[] args) {
    X obj1 = new Y();
    Z obj2 = (Z)obj1;
    obj2.method();
  }
}
