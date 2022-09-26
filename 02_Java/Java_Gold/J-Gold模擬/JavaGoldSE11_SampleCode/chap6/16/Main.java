import java.util.stream.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Stream.of("naoki", "akko", "ami")
          .sorted()
          .forEach(x -> System.out.print(x + " "));
    System.out.println();
    Stream.of("naoki", "akko", "ami")
          .sorted(Comparator.reverseOrder())
          .forEach(x -> System.out.print(x + " "));
  }
}
