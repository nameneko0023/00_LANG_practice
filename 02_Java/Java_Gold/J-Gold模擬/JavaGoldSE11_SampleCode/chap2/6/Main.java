import java.text.*;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws ParseException {
    // 非推奨のコンストラクタの使用
    Date date = new Date("2021/03/15");
    
      //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
      //Date date = df.parse("2021/03/15");
    System.out.println(date);
  }
}
