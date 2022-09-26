public class Test {
  static interface A { }
  static class B implements A { }
  static class C extends B { }
  public static void main(String[] args) {
    C c = new C();
    A a = c;
    if(c instanceof A) System.out.print("1 ");
    if(c instanceof B) System.out.print("2 ");
  }
}
