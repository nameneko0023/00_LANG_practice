import java.util.stream.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    boolean r1 = Stream.of("", " ").allMatch(String::isEmpty);
    boolean r2 = Stream.of("", " ").noneMatch(String::isEmpty);
    System.out.println(r1 + " " + r2);
  }
}
