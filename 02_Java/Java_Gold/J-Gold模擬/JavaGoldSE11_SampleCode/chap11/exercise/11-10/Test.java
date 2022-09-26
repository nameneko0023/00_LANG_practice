import java.time.*;
import java.time.format.*;

public class Test {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 10);
    DateTimeFormatter fmt1 = 
         DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    System.out.println(fmt1.format(date)); 
  }
}