import java.util.stream.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    Stream<Integer> stream1 = Stream.of(3, 5, 7, 9);
    Map<Boolean, List<Integer>> map1 = 
                stream1.collect(
                        Collectors.partitioningBy(s -> s > 5));
    System.out.println(map1);
    
    Stream<Integer> stream2 = Stream.of(3, 5, 7, 9);
    Map<Boolean, Set<Integer>> map2 = 
                stream2.collect(
                        Collectors.partitioningBy(s -> s > 5, Collectors.toSet()));
    System.out.println(map2);
  }
}
