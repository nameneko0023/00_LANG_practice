import java.util.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    Stream<Double> stream = Stream.empty();
    System.out.println(stream.findFirst().orElseGet(() -> "empty"));  
  }
}

