import java.util.*;

public class Main {
  public static void main(String[] args) {
    m(new ArrayList<String>());
  }
    @SafeVarargs
    //@SuppressWarnings("unchecked")
    static void m(List<String>... stringLists) {
    System.out.println(stringLists);
  }
}
