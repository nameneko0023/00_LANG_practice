import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    Stream<String> stream = Stream.iterate("", s -> s + "a");
    System.out.println(stream.limit(2).map(x -> x + "x"));
  }
}
