import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    List<String> data = Arrays.asList("aaa", "bb", "c");
    Optional<String> result1 = 
            data.stream()
                .max(Comparator.naturalOrder());
    Optional<String> result2 = 
            data.stream()
                .max((d1, d2) -> d1.length() - d2.length());
    result1.ifPresent(System.out::println);  
    //System.out.println(result1.get());
    result2.ifPresent(System.out::println);  
    //System.out.println(result2.get());
  }
}
