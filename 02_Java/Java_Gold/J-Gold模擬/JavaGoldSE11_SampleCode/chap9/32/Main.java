import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Path path = Paths.get("data.txt");
    try {
      System.out.println(
             Files.lines(path)
                  .filter(s -> s.startsWith("File"))
                  .map(word -> word.length())
                  .collect(Collectors.toList()));
    } catch (IOException e) { e.printStackTrace(); }
  }
}
