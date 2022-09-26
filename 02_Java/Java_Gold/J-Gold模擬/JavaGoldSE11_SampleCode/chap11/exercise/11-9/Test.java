import java.util.*;

public class Test {
  public static void main(String[] args) {
    ResourceBundle bundle
            = ResourceBundle.getBundle("SE", Locale.US);
    Properties props = new Properties();
    bundle.keySet()
          .stream()
          .forEach(k -> props.put(k, bundle.getString(k)));
    bar(props);
  }
  static void bar(Properties props) {
    System.out.println(props.get("drink", "water") + " " +
                       props.get("snack", "fruit"));
  }
}
