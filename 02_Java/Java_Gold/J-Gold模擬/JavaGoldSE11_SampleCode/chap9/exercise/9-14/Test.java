import java.nio.file.*;
public class Test {
  public static void main(String[] args) {
    Path path1 = Paths.get("/tmp/.././home", "../my.txt");
    System.out.println(path1.normalize());
  }
}
