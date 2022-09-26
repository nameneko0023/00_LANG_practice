import java.util.*;

public class Main {
  public static void main(String[] args) {
    ResourceBundle bundle
            = ResourceBundle.getBundle("MyResources", Locale.US);
    Set<String> keys = bundle.keySet();
    keys.stream()
       .map(k -> bundle.getString(k))
       .forEach(System.out::println);
  }
}
