import java.nio.file.*;

public class Main {
  public static void main(String[] args) throws java.io.IOException {
    Path p1 = Paths.get("ren");
    Files.createDirectory(p1);
    Path p2 = Paths.get("ren/tmp/x/y");
    Files.createDirectories(p2);
    Files.delete(p1);
    Files.deleteIfExists(Paths.get("ren/9_9"));
  }
}
