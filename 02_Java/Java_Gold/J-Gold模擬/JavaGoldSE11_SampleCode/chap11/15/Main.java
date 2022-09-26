import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    DateTimeFormatter fmt = 
            DateTimeFormatter.ofPattern("yyyy�N MM��dd�� EEEE");
    String target = "2021�N 01��30�� �y�j��";
    LocalDate date = LocalDate.parse(target, fmt);
    System.out.println(date);
  }
}