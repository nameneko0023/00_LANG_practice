import java.util.*;
import java.util.stream.*;
class Item {
  //more code
}
public class Test {
  @SafeVarargs
  void order(List<Item>... items) {
    if(items != null){
      System.out.println(items.length);
    }
  }
}