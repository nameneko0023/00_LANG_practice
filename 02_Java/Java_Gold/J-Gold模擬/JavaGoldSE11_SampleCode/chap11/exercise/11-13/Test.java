import java.time.*;
import java.time.format.*;
public class Test {
  public static void main(String[] args) {
    var f = DateTimeFormatter.ofPattern("yyyy month:M");
    System.out.println(f.format(LocalTime.of(2020, 10, 30)));
  }
}