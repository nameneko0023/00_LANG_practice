import java.util.*;

public class Test {
  �y   �@   �z
  static void foo(List<Double>... list) {
    System.out.println(list);
  }
  public static void main(String[] args) {
    foo(new ArrayList<Double>());
  }
}
