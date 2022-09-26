import java.util.*;
import java.text.MessageFormat;

public class Main {
  public static void main(String[] args) {
    ResourceBundle bundle
            = ResourceBundle.getBundle("MyResources", Locale.FRANCE);
    //Object[] params = {"Duke"};
    String params = "Duke";
    String msg = MessageFormat.format(bundle.getString("message"), params);
    System.out.println(msg);
  }
}
