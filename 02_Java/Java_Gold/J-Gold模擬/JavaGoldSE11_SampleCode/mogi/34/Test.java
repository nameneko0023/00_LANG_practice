import java.util.stream.*;
import java.util.function.*;
public class Test {
  public static void main(String[] args) {
    Predicate<? super String> f = s -> s.length() > 3;
    Stream<String> stream = Stream.iterate("x", s -> s + s);
    boolean a = stream.noneMatch(f);
    boolean b = stream.anyMatch(f);
    System.out.println(a + " " + b);
  }
}
