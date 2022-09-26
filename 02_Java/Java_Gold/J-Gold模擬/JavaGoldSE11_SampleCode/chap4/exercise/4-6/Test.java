import java.util.*;
public class Test {
  public static void main(String[] args) {
    Set<Number> set = new HashSet<>();
    set.add(100L);
    set.add(new Integer(80));
    set.add(null);
    set.add(80);
    System.out.println(set);
  }
}
