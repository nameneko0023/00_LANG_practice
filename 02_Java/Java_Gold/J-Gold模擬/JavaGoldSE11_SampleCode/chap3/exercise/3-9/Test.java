public class Test {
  public static void main(String[] args) throws Foo {
    try {
      throw new Foo();
    } catch(Foo | RuntimeException e) {
      �y   �@   �z
      throw e;
    }
  }
  static class Foo extends Exception { }
  static class Bar extends Foo { }
}