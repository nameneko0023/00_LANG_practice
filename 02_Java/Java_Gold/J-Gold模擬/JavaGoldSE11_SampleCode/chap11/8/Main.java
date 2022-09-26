import java.util.ResourceBundle;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    ResourceBundle obj
          = ResourceBundle.getBundle("MyResources", 
                                     new Locale("en", "US"));
    System.out.println("data : " + obj.getString("data"));
  }
}
