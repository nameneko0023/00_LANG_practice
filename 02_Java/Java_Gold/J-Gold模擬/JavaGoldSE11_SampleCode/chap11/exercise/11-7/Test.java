import java.util.ResourceBundle;
import java.util.Locale;

class Test {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("it", "IT"));
    Locale locale = Locale.getDefault();
    ResourceBundle obj
          = ResourceBundle.getBundle("MyResources", locale);
    System.out.println("data : " + obj.getString("data")); 
  }
}
