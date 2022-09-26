import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Stream<String> stream1 = 
       Stream.of("belle", "akko", "ami", "bob", "nao").parallel();
    Map<String, List<String>> map1= 
         stream1.collect(Collectors.groupingByConcurrent(
                                          s -> s.substring(0, 1)));
    System.out.println(map1);
    System.out.println("map1�̃N���X�� :" + map1.getClass());
    
    Stream<String> stream2 = 
       Stream.of("nao", "akko", "ami").parallel();
    Map<Integer, String> map2 = 
            stream2.collect(Collectors.toConcurrentMap(
                                       String::length,
                                       s -> s,
                                       (s1, s2) -> s1 + " : " + s2));
    System.out.println(map2);
    System.out.println("map2�̃N���X�� :" + map2.getClass());
  }
}
