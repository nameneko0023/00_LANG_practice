import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 1);
    System.out.println("list " + list);
    Set<Integer> set = Set.of(1, 2, 3);
    //Set<Integer> set2 = Set.of(1, 2, 1); // 実行エラー
    System.out.println("set  " + set);
    Map<Integer, String> map = Map.of(1,"a", 2,"b", 3,"c");
    System.out.println("map  " + map);
  }
}
