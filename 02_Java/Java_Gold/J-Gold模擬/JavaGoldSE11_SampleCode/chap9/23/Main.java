import java.nio.file.*;
import java.util.List;

public class Main {
  public static void main(String[] args) throws java.io.IOException {
    Path path = Paths.get("data.txt");
    List<String> lines = Files.readAllLines(path);
    for(String line : lines){
      System.out.println(line);
    }
  }
}
