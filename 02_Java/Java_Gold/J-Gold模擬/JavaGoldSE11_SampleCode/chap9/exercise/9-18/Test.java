import java.nio.file.*;
public class Test {
  public static void main(String[] args) {
    Path a = Paths.get("/food/../orange.txt");
    Path b = Paths.get("./lemon.txt");
    System.out.println(a.resolve(b));
    System.out.println(b.resolve(a));
  }
}
