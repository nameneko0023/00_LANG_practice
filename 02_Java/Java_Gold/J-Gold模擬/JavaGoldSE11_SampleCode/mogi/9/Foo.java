public interface Foo {
  default void method() { }
}
class MyFoo implements Foo {
  //@Override public boolean equals(Object o) { return false; }
  //@Override public boolean equals(MyFoo o) { return false; }
  //@Override public int hashCode() { return 55; }
  //@Override public long hashCode() { return 55; }
  //@Override void method() { }
  //@Override public void method() { }
}
