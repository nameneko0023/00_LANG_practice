import java.util.stream.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    double result = DoubleStream.of(10.0, 20.0, 30.0)
           .mapToInt(x -> x)
           .boxed()
           .collect(Collectors.averagingInt(x -> x));
    System.out.println(result);
  }
}
