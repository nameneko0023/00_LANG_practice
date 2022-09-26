import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
public class Test{
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("/bar");
    Files.find(path, 0, (pt, attr) -> attr.isSymbolicLink())
         .map(p -> p.toString())
         .collect(Collectors.toList())
         .stream()
         .filter(x -> x.toString().endsWith(".txt"))
         .forEach(System.out::print);
  }
}
