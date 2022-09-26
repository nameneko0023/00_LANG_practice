import java.util.function.*;
import java.util.*;

interface Foo<T, R> {
  public R exec(T t);
}
public class Test {
  public static void main(String[] args) {
    double num = 1000.0;
    Foo<Integer, Double> obj = x -> x + num;
    Double ans = obj.exec(2000);
    System.out.println(ans);
  }
}