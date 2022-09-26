interface Foo { boolean bar(double a, double b); }
class Test {
  public static void main(String[] args) {
    method((x, y) -> x / y, 3.0);
  }
  static void method(Foo obj, double d) {
    if(obj.bar(9.0, d)) System.out.println("a");
    else System.out.println("b");
  }
}
