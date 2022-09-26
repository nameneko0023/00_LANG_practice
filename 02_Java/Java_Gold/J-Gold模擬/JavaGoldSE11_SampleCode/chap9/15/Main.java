import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    // Windows�̏ꍇ
    Path path = Paths.get("C:\\sample\\chap9\\15\\data.txt");
    // Linux�̏ꍇ
    //Path path = Paths.get("/sample/chap9/15/data.txt");
    System.out.format("toString    : %s%n", path.toString());
    System.out.format("getFileName : %s%n", path.getFileName());
    System.out.format("getName(0)  : %s%n", path.getName(0));
    System.out.format("getNameCount: %d%n", path.getNameCount());
    System.out.format("getRoot     : %s%n", path.getRoot());
    while((path = path.getParent()) != null){
        System.out.format("  getParent   : %s%n", path);
    }
    Path p = Paths.get("data.txt");
    System.out.format("getRoot     : %s%n", p.getRoot());
  }
}
