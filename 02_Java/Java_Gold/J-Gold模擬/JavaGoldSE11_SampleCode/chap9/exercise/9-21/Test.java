import java.io.*;
import java.nio.file.*;

public class Test {
  public static void main(String[] args) {
    Path path = Paths.get("./foo");
    try {
      boolean result = Files.walk(path)
                            .filter(p -> p.isDirectory())
                            .findFirst().isPresent();
      System.out.println(result);
    } catch (IOException e) { e.printStackTrace(); }
  }
}
