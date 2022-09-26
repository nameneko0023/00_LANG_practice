import java.util.*;
public class Test {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    for(int i = 10; i < 15; i++) map.put(i, "item-" + i);
    System.out.println(map.get(4));
  }
}
