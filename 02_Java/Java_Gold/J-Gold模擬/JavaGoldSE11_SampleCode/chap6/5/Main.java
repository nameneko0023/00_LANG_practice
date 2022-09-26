import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Stream<Integer> stream = Stream.of(10, 20, 30);
    int result = stream.reduce(0, (a, b) -> a + b);
    //int result = stream.reduce(0, Integer::sum);
    System.out.println(result);
  }
}
