import java.util.stream.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    LongStream stream = LongStream.of(1, 2, 3);
    OptionalLong op = stream.map(n -> n * 2)
                            .filter(n -> n < 5)
                            .findFirst();
    【   ①   】
  }
}
