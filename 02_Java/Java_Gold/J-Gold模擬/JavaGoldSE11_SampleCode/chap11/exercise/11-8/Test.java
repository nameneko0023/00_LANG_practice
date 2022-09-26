import java.util.ResourceBundle;
import java.util.Locale;
class Test {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("en", "US"));
    Locale loc = Locale.getDefault();
    ResourceBundle mes = ResourceBundle.getBundle("MyR", loc);
    System.out.print("|");
    System.out.print(mes.getString("data"));
    System.out.print("|");
  }
}
