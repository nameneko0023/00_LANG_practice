import java.util.stream.*;
import java.util.function.*;
public class Test {
  public static void main(String[] args) {
    var stream = Stream.iterate(10, s -> s <= 50, n -> n + 10);
    boolean ans = stream.anyMatch(s -> s%30 == 0);
    long count = stream.count();
    System.out.println(ans + " " + count);
  }
}
