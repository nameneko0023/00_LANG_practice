import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class User {
  String name;
  double point;
  User(String name, double point) {
    this.name = name;
    this.point = point;
  }
  public String getName() { return name; }
  public double getPoint() { return point; }
}

public class Test {
  public static void main(String[] args) {
    List<User> users = Arrays.asList(
                     new User("tanaka", 10.0),
                     new User("sato", 15.0));
    BinaryOperator<Double> ope = (a, b) -> a + b;
    Åy   á@   Åz
    System.out.println(total);
  }
}

