public class Test  {
  public static void main(String[] args) {
    try(Foo o1 = new Foo(); Bar o2 = new Bar()) {
      System.out.print("A ");
    } catch (Exception e) { System.out.print("B ");
    } finally { System.out.print("C ");
    }
  }
  static class Foo implements AutoCloseable {
    public void close() { System.out.print("D "); }
  }
  static class Bar implements java.io.Closeable {
    public void close() { 
      System.out.print("E ");
      throw new RuntimeException();
    }
  }
}
