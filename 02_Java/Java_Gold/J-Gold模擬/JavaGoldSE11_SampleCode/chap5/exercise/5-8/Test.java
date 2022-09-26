import java.util.function.*;
import java.util.*;

public class Test {
  public static void main(String[] args) {
    List<String> codes = Arrays.asList("AC", "NU", "BG", "NB");
    codes.sort(new Comparator<String>() {
                   public int compare(String a, String b) {
                     return b.compareTo(a);
                   }
                 });
    System.out.println(codes);
  }
}
