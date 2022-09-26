import java.util.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    Stream<String> stream1 = Stream.of("a", "b", "ax");
    Stream<String> stream2 = Stream.empty();
    Map<Boolean, List<String>> map1 = 
      stream1.collect(Collectors.partitioningBy(s -> s.startsWith("x")));
    Map<Boolean, List<String>> map2 = 
      stream2.collect(Collectors.groupingBy(s -> s.startsWith("x")));
    System.out.println(map1 + " " + map2);
  }
}
