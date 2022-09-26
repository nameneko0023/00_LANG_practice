import java.util.stream.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // �\��2�̗� 1
    Stream<String> stream1 = 
                Stream.of("belle", "akko", "ami", "bob", "nao");
    Map<String, Set<String>> map1 = 
                stream1.collect(Collectors.groupingBy(
                                           s -> s.substring(0, 1),
                                           Collectors.toSet()));
    System.out.println(map1);
    // �\��2�̗� 2
    Stream<String> stream2 = 
                Stream.of("belle", "akko", "ami", "bob", "nao");
    Map<String, String> map2 = 
                stream2.collect(Collectors.groupingBy(
                                          s -> s.substring(0, 1),
                                          Collectors.joining()));
    System.out.println(map2);
    System.out.println("map2�̃N���X�� :" + map2.getClass());
    // �\��3�̗�
    Stream<String> stream3 = 
                   Stream.of("belle", "akko", "ami", "bob", "nao");
    Map<String, String> map3 = 
                stream3.collect(Collectors.groupingBy(
                                          s -> s.substring(0, 1),
                                          TreeMap::new,
                                          Collectors.joining()));
    System.out.println(map3);
    System.out.println("map3�̃N���X�� :" + map3.getClass());
  }
}
