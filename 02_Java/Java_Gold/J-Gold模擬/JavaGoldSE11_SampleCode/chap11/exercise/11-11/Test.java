import java.time.*;
import java.time.format.*;

public class Test {
  public static void main(String[] args) {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yy,MM,dd");
    String target = "20,11,14";
    LocalDate date = LocalDate.parse(target, fmt);
    System.out.println(date);
  }
}

