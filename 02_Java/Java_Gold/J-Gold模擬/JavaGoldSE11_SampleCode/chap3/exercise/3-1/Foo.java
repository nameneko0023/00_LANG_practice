public class Foo implements AutoCloseable {
  public static void main(String[] args) {
    try(Foo obj = new Foo()) {
      System.out.println("x");
    }
  }
  public void close() throws Exception {
    throw new Exception("y");
  }
}
