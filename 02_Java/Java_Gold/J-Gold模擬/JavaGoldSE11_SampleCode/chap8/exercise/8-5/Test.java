import java.util.*;
import java.util.stream.*;
public class Test {  
  public static void main(String[] args) {
   int num = Arrays.asList("100", "200", "300")
                 .parallel()
                 .map(Integer::parseInt)
                 .reduce(0, (s1, s2) -> s1 +  s2);
    System.out.println(num);
  }
}
