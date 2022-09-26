import java.util.function.*;
import java.util.*;

public class Test {
  public static void main(String[] args) {
    DoubleFunction f = i -> i * 0.1;
    Double ans = f.apply(100);
    System.out.println(ans);
  }
}
