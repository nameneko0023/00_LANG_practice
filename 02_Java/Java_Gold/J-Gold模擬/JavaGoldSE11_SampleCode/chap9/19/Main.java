import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    Path p1 = Paths.get("X");
    Path p2 = Paths.get("Y");
    System.out.println("X �� Y ���΃p�X : " + p1.relativize(p2));
    System.out.println("Y �� X ���΃p�X : " + p2.relativize(p1));
  }
}
