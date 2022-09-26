import java.nio.file.*;
import java.nio.file.attribute.*;

public class Main {
  public static void main(String[] args) throws java.io.IOException {
    Path p1 = Paths.get("data.txt");
    BasicFileAttributes attr =
            Files.readAttributes(p1, BasicFileAttributes.class);
    System.out.format("creationTime     : %s%n", attr.creationTime());
    System.out.format("lastModifiedTime : %s%n",
                                             attr.lastModifiedTime());
    System.out.format("size             : %s%n", attr.size());
  }
}
