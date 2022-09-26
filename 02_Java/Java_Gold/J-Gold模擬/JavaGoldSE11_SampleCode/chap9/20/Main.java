import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    Path p1 = Paths.get("data.txt");
    Path p2 = Paths.get("C:/sample/chap9/20/data.txt");
    System.out.format("exists       : %s%n", Files.exists(p1));
    try {
      System.out.format(
                   "isSameFile   : %s%n", Files.isSameFile(p1, p2));
    } catch(java.io.IOException e) { } 
    System.out.format("isDirectory  : %s%n", Files.isDirectory(p1));
    System.out.format("isRegularFile: %s%n", Files.isRegularFile(p1));
    System.out.format("isReadable   : %s%n", Files.isReadable(p1));
    System.out.format("isExecutable : %s%n", Files.isExecutable(p1));
  }
}
