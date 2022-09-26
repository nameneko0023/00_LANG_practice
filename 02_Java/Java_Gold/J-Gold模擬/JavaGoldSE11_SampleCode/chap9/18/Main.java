import java.nio.file.*;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Path path1 = Paths.get("../../chap9");
    Path path2 = Paths.get("18/X");
    System.out.format("resolve : %s%n", path1.resolve(path2));
    Path path3 = Paths.get("C:/sample");
    System.out.format("resolve : %s%n", path1.resolve(path3));
    Path path = Paths.get("C:/sample/chap9");
    Iterator<Path> iter = path.iterator();
    while(iter.hasNext()){
      System.out.println(iter.next());
    }
  }
}