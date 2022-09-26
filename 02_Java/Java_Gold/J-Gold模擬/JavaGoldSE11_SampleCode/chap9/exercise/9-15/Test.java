import java.nio.file.*;
public class Test {
  public static void main(String[] args) {
    Path path1 = Paths.get(".").normalize();
    System.out.println(path1.getNameCount());
  }
}
