import java.util.*;
import java.util.stream.*;
public class Test {  
  public static void main(String[] args) {
    Stream<Integer> s1 = Stream.of(10, 20, 30, 40).parallel();
    Stream<Integer> s2 = Stream.of(50, 60, 70).parallel();
    Stream<Stream<Integer>> stream = Stream.of(s1, s2);
    Map<Boolean, List<Integer>> map = 
          stream.flatMap(i -> i)
          .collect(Collectors.groupingByConcurrent(
                                      i -> i < 35));
    System.out.println(map.get(true).size() + " " +
                       map.get(false).size() );
  }  
}
