public class Foo<T> {
  T t;
  public Foo(T t) { this.t = t; }
  public String toString() { return t.toString(); }
  public static void main(String[] args) {
    System.out.print(new Foo(true) + " ");
    System.out.print(new Foo<>(10) + " ");
    System.out.print(new Foo<String>("c") + " ");
  }
}
