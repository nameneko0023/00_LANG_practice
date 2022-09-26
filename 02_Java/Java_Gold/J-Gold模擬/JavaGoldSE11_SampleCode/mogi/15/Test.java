import java.io.*;
public class Test {
  public static void main(String[] args) {
    try(Foo obj1 = new Foo(); Foo obj2 = new Foo()) {
      throw new RuntimeException("main");
    } catch(Exception e) {
      System.out.print(e.getMessage() + " " +
                       e.getSuppressed().length);
  }}
  static class Foo implements AutoCloseable {
    public void close() {
      throw new RuntimeException("close"); 
  }}
}
