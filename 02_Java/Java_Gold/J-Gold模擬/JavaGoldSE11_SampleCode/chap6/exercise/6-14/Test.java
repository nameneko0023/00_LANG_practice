import java.util.stream.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    Stream.iterate(1, i -> i++) 
          .limit(5)
          .map(i -> i)
          .collect(Collectors.joining());
  }
}
