import java.nio.file.*;
public class Test {
  public static void main(String[] args) throws java.io.IOException {
    Path p1 = Paths.get("foo.txt");
    Path p2 = Paths.get("mydata");
    Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE,
                       LinkOption.NOFOLLOW_LINKS);
  }
}
