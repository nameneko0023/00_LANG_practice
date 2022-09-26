import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) throws IOException {
    Path p1 = Paths.get("foo/./").resolve(Paths.get("x.txt"));
    Path p2 = new File("foo/././bar/../x.txt").toPath();
    boolean b1 = Files.isSameFile(p1, p2);
    boolean b2 = p1.equals(p2);
    boolean b3 = p1.normalize().equals(p2.normalize());
    System.out.println(b1 + " " + b2 + " " + b3);
  }
}
