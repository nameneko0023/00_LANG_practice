import java.util.stream.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    Åy   á@   Åz
  }
  public static void foo(Stream<Integer> stream) {
    Optional option = stream.filter(x -> x < 5)
    .limit(3)
    .max((x, y) -> x-y);
    System.out.println(option.get());
  }
}
