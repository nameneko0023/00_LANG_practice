import java.util.stream.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // minBy()���\�b�h�̗�
    Stream<String> stream1 = 
                   Stream.of("naoki", "akko", "ami");
    Optional<String> result1 = 
                  stream1.collect(
                  Collectors.minBy(Comparator.naturalOrder()));
    System.out.println(result1.get());
    
    // maxBy()���\�b�h�̗�
    Stream<String> stream2 = 
                   Stream.of("101", "105", "106", "203", "205");
    Map<String, Optional<String>> result2 = 
                   stream2.collect(
                   Collectors.groupingBy(
                       s -> s.substring(0, 1),
                       Collectors.maxBy(Comparator.naturalOrder()) ));
    System.out.println(result2);
  }
}
