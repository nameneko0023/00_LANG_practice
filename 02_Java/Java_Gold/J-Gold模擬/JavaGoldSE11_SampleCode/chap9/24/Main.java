import java.nio.file.*;

public class Main {
  public static void main(String[] args) throws java.io.IOException {
    Path path = Paths.get("data.txt");
    Object obj1 = Files.getAttribute(path, "creationTime");
    Object obj2 = Files.getAttribute(path, "lastModifiedTime");
    Object obj3 = Files.getAttribute(path, "size");
    System.out.format("creationTime     : %s%n", obj1);
    System.out.format("lastModifiedTime : %s%n", obj2);
    System.out.format("size             : %s%n", obj3);
  }
}
