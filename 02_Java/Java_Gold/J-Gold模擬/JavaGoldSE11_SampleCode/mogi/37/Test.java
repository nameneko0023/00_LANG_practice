import java.util.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("D", "Z", "F");
    List<String> sortedList = mySort(list);
    System.out.println(sortedList);
    
  }
  static List<String> mySort(List<String> list) {
    List<String> copyList = new ArrayList<>(list);
    Collections.sort(copyList, (x, y) -> y.compareTo(x));
    return copyList;
   
    
    /* A
    return list.stream()
               .compareTo((x, y) -> y.compareTo(x))
               .sort();
    */
    
    /* B
    return list.stream()
               .sorted((x, y) -> y.compareTo(x))
               .collect();
    */
    
    /* C
    return list.stream()
               .sorted((x, y) -> y.compareTo(x))
               .collect(Collectors.toList());
    */
    
    /* D
    return list.stream()
               .compare((x, y) -> y.compareTo(x))
               .collect(Collectors.toList());
    */
    
    /* E
    return list.stream()
               .compare((x, y) -> y.compareTo(x))
               .sort();
    */
    
    /* F
    return list.stream()
               .compareTo((x, y) -> y.compareTo(x))
               .collect(Collectors.toList());
     */
  }
  
  
}
