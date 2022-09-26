import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
  public static void main(String[] args) {
    Map<Integer, String> map = new ConcurrentHashMap<>();
    map.put(1, "tanaka");
    map.put(2, "urai");
    for(Integer key : map.keySet()){ map.remove(key); }
  }
}
