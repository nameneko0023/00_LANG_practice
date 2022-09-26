import java.text.*;

public class Test {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("##,000.0#");
    String a = df.format(10.23);
    String b = df.format(3870);
    System.out.print(a + "/" + b);
  }
}
