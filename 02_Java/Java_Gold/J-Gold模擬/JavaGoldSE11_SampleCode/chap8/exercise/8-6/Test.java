import java.util.*;
import java.util.stream.*;
public class Test {  
  public static void main(String[] args) {
    int length = Arrays.asList("123", "456", "789")
                 .parallelStream()
                 .reduce(0, (s1, s2) -> s1.length() + s2.length());
    System.out.println(length);
  }
}
