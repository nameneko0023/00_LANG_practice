import java.util.function.*;

public class Test {
  public static void main(String[] args) {
    IntUnaryOperator iu1 = a -> a * 2;
    IntUnaryOperator iu2 = a -> a - 5;
    IntUnaryOperator iu3 = iu1.compose(iu2);
    System.out.println(iu3.applyAsInt(10));
  }
}
