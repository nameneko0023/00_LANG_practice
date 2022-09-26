import java.util.function.*;
public class Test {
  public static void main(String[] args) {
    ToDoubleFunction f = i -> i * 0.1;
    System.out.println(f.applyAsDouble(100));
  }
}
