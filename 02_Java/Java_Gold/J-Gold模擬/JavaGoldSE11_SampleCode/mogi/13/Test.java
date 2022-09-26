import java.io.*;
public class Test {
  static class Foo implements AutoCloseable {
    public void close() {
      System.out.print("A");
      throw new RuntimeException(); }}
  static class Bar implements Closeable {
    public void close() {
      System.out.print("B");
      throw new RuntimeException(); }}
  public static void main(String[] args) {
    try {
      Foo foo = new Foo();
      Bar bar = new Bar();
    } catch(Exception e) { System.out.print("C");
    } finally { System.out.print("D"); }
  }
}