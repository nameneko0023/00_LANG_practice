import java.util.*;
import java.util.stream.*;
import java.text.*;

public class Test {
  public static void main(String[] args) {
    String pattern = "#,###,000.0#";
    DoubleStream.of(5.21, 8.49, 1234)
        .mapToObj(v -> new DecimalFormat(pattern).format(v))
        .forEach(x -> System.out.print(x + " "));
  }
}