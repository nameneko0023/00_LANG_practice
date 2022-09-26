import java.util.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    List<Integer> list = IntStream.range(10, 15)
                                  .mapToObj(i -> i)
                                  .collect(Collectors.toList());
    list.forEach(System.out::print);
  }
}
