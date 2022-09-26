import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    Path path1 = Paths.get("./data.txt");
    System.out.format("toString()     : %s%n", path1.toString());
    System.out.format("normalize()    : %s%n", path1.normalize());
    System.out.format("toUri()        : %s%n", path1.toUri());
    System.out.format("isAbsolute     : %s%n", path1.isAbsolute());
    System.out.format(
                  "toAbsolutePath : %s%n", path1.toAbsolutePath());
    Path path2 = null;
    try {
      path2 = path1.toRealPath();
      System.out.format("toRealPath()   : %s%n", path2);
    } catch(java.io.IOException e){ e.printStackTrace(); }
  }
}
