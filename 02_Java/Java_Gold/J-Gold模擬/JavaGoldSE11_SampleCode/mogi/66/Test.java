import java.nio.file.*;
import java.io.*;
public class Test {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("/foo");
    if(Files.isDirectory(path) && Files.isSymbolicLink(path))
       Files.createDirectory(path.resolve("test"));
  }
}
