public class Test {
  public static void main(String[] args) throws Foo {
    try {
      throw new Foo();
    } catch(Foo e) {
      Åy   á@   Åz
      throw e;
    }
  }
  static class Foo extends Exception { }
  static class Bar extends Foo { }
}
