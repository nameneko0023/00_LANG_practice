import java.util.Locale;
import java.text.*;

public class Main {
  public static void main(String[] args) {
    try {
      NumberFormat usNum = NumberFormat.getInstance(Locale.US);
      Number value1 = usNum.parse("500.12");
      System.out.println("value1 : " + value1);
      NumberFormat usCur = 
                   NumberFormat.getCurrencyInstance(Locale.US);
      double value2 = (double)usCur.parse("$20,456.99");
      System.out.println("value2 : " + value2);
    } catch(ParseException e) { e.printStackTrace(); }
  }
}
