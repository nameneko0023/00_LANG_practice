import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    FileSystem fs = FileSystems.getDefault();
    Path path1 = fs.getPath("data.txt");
    Path path2 = fs.getPath("C:\\sample\\chap9\\14\\data.txt");
    Path path3 = 
         fs.getPath("C:", "sample", "chap9", "14", "data.txt");
    System.out.println(path1);
    System.out.println(path2);
    System.out.println(path3);
  }
}
