import java.util.function.*;
import java.util.stream.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    BinaryOperator<Integer> operator = (a, b) -> a + b;
    Stream<Integer> stream1 = Stream.of(10, 20, 30);
    //int result = stream1.reduce(operator);
    Optional<Integer> result = stream1.reduce(operator);
    result.ifPresent(System.out::println);  // 出力は60
    
    Stream<Integer> stream2 = Stream.empty();
    Optional<Integer> result2 = stream2.reduce(operator);
    System.out.println(result2);            // 出力はOptional.empty
    result2.ifPresent(System.out::println); // 出力データなし
  }
}
