import java.util.*;
import java.util.concurrent.*;

public class Test{
  public static void main(String[] args) {
    Integer a = Arrays.asList(3, 4, 5).stream().findAny().get();
    synchronized(a) {
      Integer b = Arrays.asList(6, 7, 8)
      .parallelStream()
      .sorted()
      .findAny().get();
      System.out.println(a + " " + b);
    }
  }
}
