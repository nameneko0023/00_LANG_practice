import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
     var path = Path.of("foo");
     try (var files = 
              Files.find(path, 0, (p, at) -> at.isRegularFile())) {
          files.map(s -> s.toString())
               .filter(s -> s.toString().endsWith(".txt"))
               .forEach(System.out::println);
     } catch(java.io.IOException e) { }
  }
}
