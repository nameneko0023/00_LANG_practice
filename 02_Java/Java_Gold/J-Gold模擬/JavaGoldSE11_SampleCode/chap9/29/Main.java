import java.io.*;
import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    Path path = Paths.get("ren");
    try {
      Files.walk(path)
           .filter(s -> s.toString().endsWith(".jpg"))
           .forEach(System.out::println);
    } catch (IOException e) { e.printStackTrace(); }
  }
}
