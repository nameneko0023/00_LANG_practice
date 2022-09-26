import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    Stream.generate(() -> "hello")
          .limit(2)
          .filter(s -> s.length() > 3)
          .peek(x -> System.out.println(x + " "))
          .forEach(x -> System.out.println(x + " "));
  }
}
