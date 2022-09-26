import java.io.*;
import java.nio.file.*;

class Test {
  public static void main(String[] args) {
    try {
      File file = new File("/home/yuko/test.txt");
      file.delete();
    } catch(SecurityException e) {
      System.out.println("íœ¸”s");
      e.printStackTrace();
    }
  }
}
