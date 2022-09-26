import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    DoubleStream stream = DoubleStream.of(0.3, 0.8);
    stream.peek(System.out::println).filter(a -> a > 0.5).count();
  }
}
