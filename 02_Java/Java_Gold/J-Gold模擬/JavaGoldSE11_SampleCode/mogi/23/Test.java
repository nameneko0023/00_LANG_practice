import java.io.*;
public class Test {
  public static void main(String[] args) {
    //Test.<NullPointerException>foo(new NullPointerException("ex"));
    //Test.<Throwable>foo(new Exception("ex"));
    //Test.foo(new Throwable("ex"));
    //Test.foo(new IOException("ex"));
    //Test.foo(new Exception("ex"));
  }
  static <T extends Exception> void foo(T t) {
    System.out.println(t.getMessage());
  }
}
