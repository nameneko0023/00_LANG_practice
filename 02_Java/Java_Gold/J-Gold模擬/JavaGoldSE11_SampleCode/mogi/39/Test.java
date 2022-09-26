import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    Stream<Integer> stream1 = Stream.of(10);
    IntStream stream2 = stream1.mapToInt(a -> a);
    Stream<Integer> stream3 = Stream.of(10);
    DoubleStream stream4 = stream3.mapToDouble(a -> a);
    Stream<Integer> stream5 = stream4.mapToInt(a -> a);
  }
}
