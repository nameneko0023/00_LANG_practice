import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    DateTimeFormatter fmt = 
            DateTimeFormatter.ofPattern("yyyy年 MM月dd日 EEEE");
    String target = "2021年 01月30日 土曜日";
    LocalDate date = LocalDate.parse(target, fmt);
    System.out.println(date);
  }
}