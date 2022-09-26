import java.nio.file.*;
public class Test {
  public static void main(String[] args) {
    Path path = Paths.get("/memo/doc/sample/t.txt");
    System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath());
  }
}
