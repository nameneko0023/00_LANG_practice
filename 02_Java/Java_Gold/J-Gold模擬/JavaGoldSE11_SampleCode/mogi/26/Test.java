import java.util.*;
public class Test {
  public static void main(String[] args) {
    Comparator<Integer> obj = (v1, v2) -> v2 - v1;
    List<Integer> list = Arrays.asList(10, 2, 30, 2);
    Collections.sort(list, obj);
    System.out.println(Collections.binarySearch(list, 2));
  }
}
