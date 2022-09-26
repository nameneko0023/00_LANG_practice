import java.nio.file.*;
public class Test {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("card/clover");
      if(Files.isSameFile(path, Paths.get("/sample/card/clover"))){
        System.out.println(path.resolve("bar"));
      }
    } catch(java.io.IOException e) { }
  }
}
