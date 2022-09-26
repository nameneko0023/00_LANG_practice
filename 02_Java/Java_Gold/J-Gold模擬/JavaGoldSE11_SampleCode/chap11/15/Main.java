import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    DateTimeFormatter fmt = 
            DateTimeFormatter.ofPattern("yyyy”N MMŒŽdd“ú EEEE");
    String target = "2021”N 01ŒŽ30“ú “y—j“ú";
    LocalDate date = LocalDate.parse(target, fmt);
    System.out.println(date);
  }
}