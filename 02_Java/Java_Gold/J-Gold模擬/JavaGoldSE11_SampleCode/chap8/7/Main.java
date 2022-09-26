import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "tanaka"); map.put(2, "urai");
    //map.remove(1);      map.remove(2);
    for(Integer key : map.keySet()){ map.remove(key); }
  }
}
