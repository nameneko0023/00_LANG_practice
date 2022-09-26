import java.util.function.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    Predicate<? super String> p = s -> s.length() < 5;
    Stream<String> stream = Stream.generate(() -> "orange");
    System.out.print(stream.anyMatch(p) + " ");
  }
}
