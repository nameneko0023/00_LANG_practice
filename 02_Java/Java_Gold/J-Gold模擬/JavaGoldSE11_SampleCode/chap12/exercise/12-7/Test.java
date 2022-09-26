import java.util.*;

public class Test {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "tanaka"); 
    map.put(2, "sato");
    map.put(3, "suzuki");
    for(Integer key : map.keySet()){ 
      if(key == 2) map.remove(key);
    }
    System.out.println(map);
  }
}
