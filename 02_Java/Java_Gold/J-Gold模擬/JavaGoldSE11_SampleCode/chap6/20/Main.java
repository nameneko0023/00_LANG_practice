import java.util.stream.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // toList()���\�b�h
    Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
    List<String> result1 = stream1.collect(Collectors.toList());
    System.out.println(result1);
    
    // joining()���\�b�h
    Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
    String result2 = stream2.collect(Collectors.joining(" | "));
    System.out.println(result2);
    
    // summingInt()���\�b�h
    Stream<String> stream3 = Stream.of("naoki", "akko", "ami");
    Integer result3 = stream3.collect(
                       Collectors.summingInt(t -> t.length()));
    System.out.println(result3);
    
    // averagingInt()���\�b�h
    Stream<String> stream4 = Stream.of("naoki", "akko", "ami");
    Double result4 = stream4.collect(
                       Collectors.averagingInt(t -> t.length()));
    System.out.println(result4);
  }
}
