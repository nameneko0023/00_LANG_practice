import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    Path path = Paths.get("C:/sample/chap9/16/data.txt");
    System.out.format("1-4     : %s%n", path.subpath(1,4));
    System.out.format("0-2     : %s%n", path.subpath(0,2));
    //System.out.format("0-5     : %s%n", path.subpath(0,5));
    //System.out.format("2-2     : %s%n", path.subpath(2,2));
  }
}
