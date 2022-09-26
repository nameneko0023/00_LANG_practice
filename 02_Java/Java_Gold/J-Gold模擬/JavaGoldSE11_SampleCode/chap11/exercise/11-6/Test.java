import java.util.ResourceBundle;
import java.util.Locale;

class Test {
  public static void main(String[] args) {
    ResourceBundle obj
         = ResourceBundle.getBundle("MyResources", Locale.US);
    System.out.println(obj.getObject(1));
  }
}
