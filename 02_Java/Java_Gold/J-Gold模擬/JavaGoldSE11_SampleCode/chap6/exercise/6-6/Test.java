import java.util.stream.*;

public class Test {
  public static void main(String[] args) {
    var stream = Stream.iterate("1", n -> n + "1");
    System.out.println(stream.limit(5).filter(s -> s.length() < 3));
  }
}