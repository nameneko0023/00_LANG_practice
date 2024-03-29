import java.util.stream.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Stream<String> stream1 = Stream.of("nao", "akko", "ami");
    Map<String, Integer> map1 = stream1.collect(
                            Collectors.toMap(s -> s, String::length));
    System.out.println(map1);

    Stream<String> stream2 = Stream.of("nao", "akko", "ami");
    Map<Integer, String> map2 = stream2.collect(
                            Collectors.toMap(String::length, s -> s));
    System.out.println(map2);
  }
}
