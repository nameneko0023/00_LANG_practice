import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.chrono.JapaneseDate;

public class Main {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2021, 1, 1);
    DateTimeFormatter f1 = 
             DateTimeFormatter.ofPattern("G yy�N E", Locale.US);
    DateTimeFormatter f2 = 
             DateTimeFormatter.ofPattern("GGGG yy�N EEEE", Locale.US);
    DateTimeFormatter f3 = 
             DateTimeFormatter.ofPattern("GGGGG yy�N EEEEE", Locale.US);
    System.out.println("G yy�N E         : " + date.format(f1));
    System.out.println("GGGG yy�N EEEE   : " + date.format(f2));
    System.out.println("GGGGG yy�N EEEEE : " + date.format(f3));

    JapaneseDate j_date = JapaneseDate.of(2021, 1, 1);
    DateTimeFormatter jf1 = 
             DateTimeFormatter.ofPattern("G yy�N E");
    DateTimeFormatter jf2 = 
             DateTimeFormatter.ofPattern("GGGG yy�N EEEE");
    DateTimeFormatter jf3 = 
             DateTimeFormatter.ofPattern("GGGGG yy�N EEEEE");
    System.out.println("G yy�N E         : " + j_date.format(jf1));
    System.out.println("GGGG yy�N EEEE   : " + j_date.format(jf2));
    System.out.println("GGGGG yy�N EEEEE : " + j_date.format(jf3));
  }
}