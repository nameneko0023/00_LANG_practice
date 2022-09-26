import java.io.*;
import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    FileSystem fs = FileSystems.getDefault();
    Iterable<Path> dirs = fs.getRootDirectories();
    for(Path name: dirs){
      System.out.println("RootDirectories : " + name);
    }
    Path path = Paths.get("ren");
    try (DirectoryStream<Path> stream = 
                     Files.newDirectoryStream(path)) {
      for(Path file: stream){
        System.out.println(file.getFileName());
      }
    } catch (IOException e) { e.printStackTrace(); }
  }
}
