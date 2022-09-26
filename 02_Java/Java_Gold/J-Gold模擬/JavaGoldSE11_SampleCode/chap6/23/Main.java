import java.util.stream.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Stream<String> stream1 = Stream.of("nao", "akko", "ami");
    Map<Integer, String> map1 = 
            stream1.collect(Collectors.toMap(
                                       String::length,
                                       s -> s,
                                       (s1, s2) -> s1 + " : " + s2));
    System.out.println(map1);
    System.out.println(map1.getClass());
    
    Stream<String> stream2 = Stream.of("nao", "akko", "ami");
    Map<Integer, String> map2 = 
            stream2.collect(Collectors.toMap(
                                       String::length,
                                       s -> s,
                                       (s1, s2) -> s1 + " : " + s2,
                                       TreeMap::new));
    System.out.println(map2);
    System.out.println(map2.getClass());
  }
}
