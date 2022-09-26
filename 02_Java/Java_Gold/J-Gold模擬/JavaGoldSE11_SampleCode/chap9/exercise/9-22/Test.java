import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("./foo/memo.txt");
      Files.lines(path)
           .flatMap(p -> Stream.of(p.split(",")))
           .map(word -> word.length())
           .forEach(System.out::print);
    } catch(java.io.IOException e) { }
  }
}
