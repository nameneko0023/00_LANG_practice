import java.util.stream.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    List<Character> list1 = Arrays.asList('a', 'c');
    List<Character> list2 = Arrays.asList('y', 'a');
    
    Arrays.asList(list1,list2).stream()
                              .distinct()
                              .map(e -> e)
                              .forEach(System.out::println);
  }
}
