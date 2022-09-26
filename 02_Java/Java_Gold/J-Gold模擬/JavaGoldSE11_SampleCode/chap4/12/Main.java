import java.util.*;

public class Main {
  public static void main(String[] args) {
    NavigableMap<String, String> map = new TreeMap<String, String>();
    map.put("1111", "ItemA"); map.put("2222", "ItemB");
    map.put("3333", "ItemC"); map.put("4444", "ItemD");
    String key = "2000";
    if(map.containsKey(key)){ // �L�[������ꍇ
      System.out.println("get() : " + map.get(key));
    }else{ // �L�[���Ȃ��ꍇ
      System.out.println("higherKey() : " + map.higherKey(key));
      System.out.println("lowerKey()  : " + map.lowerKey(key));
    }
    NavigableMap<String, String> sub
                = map.subMap("2000", true, "3500", true);
    System.out.println("2000 - 3500 : " + sub);
  }
}
