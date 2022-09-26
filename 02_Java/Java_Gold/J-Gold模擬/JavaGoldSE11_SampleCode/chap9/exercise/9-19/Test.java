import java.nio.file.*;
import java.nio.file.attribute.*;
public class Test {
  public static void main(String[] args) {
    try {
      Path p1 = Paths.get("something.txt");
      BasicFileAttributes at =
              Files.readAttributes(p1, BasicFileAttributes.class);
      if(at.lastModifiedTime().toMillis() > 0 && at.size() > 0){
        at.setLastModifiedTime(0);
      }
    } catch(java.io.IOException e) { }
  }
}
