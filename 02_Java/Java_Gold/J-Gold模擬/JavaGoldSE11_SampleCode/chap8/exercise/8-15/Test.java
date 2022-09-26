import java.util.concurrent.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    char c1 = List.of('a', 'b', 'c')
                  .stream()
                  .findFirst()
                  .get();
    char c2 = List.of('x', 'y', 'z')
                  .parallelStream()
                  .findFirst()
                  .get();
  }
}
