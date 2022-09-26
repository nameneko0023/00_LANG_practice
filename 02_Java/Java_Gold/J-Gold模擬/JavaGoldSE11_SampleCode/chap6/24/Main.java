import java.util.stream.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Stream<String> stream = 
                   Stream.of("belle", "akko", "ami", "bob", "nao");
    Map<String, List<String>> map = 
                stream.collect(Collectors.groupingBy(
                                          s -> s.substring(0, 1)));
    System.out.println(map);
  }
}
