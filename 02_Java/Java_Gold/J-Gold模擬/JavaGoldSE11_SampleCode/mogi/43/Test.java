import java.time.*;
import java.util.function.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    Stream<LocalDate> stream = Stream.of(LocalDate.of(2020, 12, 20));
    UnaryOperator<LocalDate> uo = l -> l;
    stream.filter(l -> l != null)
          .map(uo)
          .peek(System.out::println);
  }
}
