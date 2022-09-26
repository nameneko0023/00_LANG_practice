import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.chrono.JapaneseDate;

public class Main {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2021, 1, 1);
    DateTimeFormatter f1 = 
             DateTimeFormatter.ofPattern("G yy年 E", Locale.US);
    DateTimeFormatter f2 = 
             DateTimeFormatter.ofPattern("GGGG yy年 EEEE", Locale.US);
    DateTimeFormatter f3 = 
             DateTimeFormatter.ofPattern("GGGGG yy年 EEEEE", Locale.US);
    System.out.println("G yy年 E         : " + date.format(f1));
    System.out.println("GGGG yy年 EEEE   : " + date.format(f2));
    System.out.println("GGGGG yy年 EEEEE : " + date.format(f3));

    JapaneseDate j_date = JapaneseDate.of(2021, 1, 1);
    DateTimeFormatter jf1 = 
             DateTimeFormatter.ofPattern("G yy年 E");
    DateTimeFormatter jf2 = 
             DateTimeFormatter.ofPattern("GGGG yy年 EEEE");
    DateTimeFormatter jf3 = 
             DateTimeFormatter.ofPattern("GGGGG yy年 EEEEE");
    System.out.println("G yy年 E         : " + j_date.format(jf1));
    System.out.println("GGGG yy年 EEEE   : " + j_date.format(jf2));
    System.out.println("GGGGG yy年 EEEEE : " + j_date.format(jf3));
  }
}