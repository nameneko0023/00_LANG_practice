import java.util.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    int ans = IntStream.of(10, 20, 30)
              .findFirst()
              .getAsInt();
    System.out.println(ans);
  }
}
