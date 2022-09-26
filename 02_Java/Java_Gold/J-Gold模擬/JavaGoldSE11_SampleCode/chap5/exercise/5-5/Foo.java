import java.util.function.*;
public class Foo {
  int val;
  public static void main(String[] args) {
    Foo obj = new Foo();
    obj.val = 20;
    method(obj, a -> a.val < 100);
  }
  static void method(Foo obj, Predicate<Foo> p) {
    String ans = p.test(obj) ? "hello" : "bye";
    System.out.println(ans);
  }
}