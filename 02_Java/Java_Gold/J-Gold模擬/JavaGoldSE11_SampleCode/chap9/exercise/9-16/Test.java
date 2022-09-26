import java.nio.file.*;
public class Test {
  public static void main(String[] args) throws java.io.IOException {
    Path path = 【   ①   】
    if(Files.isDirectory(path)){
      String s = Files.deleteIfExists(path) ? "OK" : "NG";
      System.out.println(s);
    }
  }
}
