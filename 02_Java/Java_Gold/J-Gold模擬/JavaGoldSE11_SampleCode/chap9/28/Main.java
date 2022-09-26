import java.io.*;
import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    Path path = Paths.get("ren");
    try {
      Files.walk(path).forEach(System.out::println);
    } catch (IOException e) { e.printStackTrace(); }
  }
}
