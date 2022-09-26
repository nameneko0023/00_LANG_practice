import java.util.stream.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    Set<Double> set = IntStream.of(2, 2, 2)
              .mapToDouble(x -> x)
              .boxed()
              .collect(Collectors.groupingBy(x -> x))
              .keySet();
    System.out.println(set);
  }
}
