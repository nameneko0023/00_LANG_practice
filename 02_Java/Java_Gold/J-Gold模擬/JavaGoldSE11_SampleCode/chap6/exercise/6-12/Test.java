import java.util.stream.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("101", "105", "103");
    var sortList = list.stream() 
                 �y   �@   �z
                  .collect(Collectors.toList());
  }
}
