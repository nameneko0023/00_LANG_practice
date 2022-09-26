import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
public class Test{
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("foo/hello.txt");
    Files.find(
        path.getParent(), 10.0, 
        (p) -> p.toString().endsWith(".txt")  || 
               Files.isDirectory(p))
      .collect(Collectors.toList())
      .forEach(System.out::println);
  }
}

