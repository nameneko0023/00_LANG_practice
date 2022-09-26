import java.io.*;
public class Test {
  public static void main(String[] args) throws BException {
    try {
      throw new BException();
    } catch(AException | RuntimeException e) {
      【   ①   】
      throw e;
    }
  }
  static class AException extends Exception { }
  static class BException extends AException { }
}
