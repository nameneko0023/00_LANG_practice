import java.util.*;

public class Main {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(0, "AAA");  
    map.put(1, "BBB");
    map.put(2, "AAA");  // �l�̏d��
    map.put(1, "CCC");  // �L�[�̏d��
    System.out.println(map.containsKey(2));
    System.out.println(map.containsValue("XXX"));
    for(int i = 0; i < map.size(); i++){
      System.out.print(map.get(i) + " ");
    }
  }
}