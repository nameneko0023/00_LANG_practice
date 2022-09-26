import java.util.function.Function;
import java.util.function.Consumer;
public class Main {
  public static void main(String[] args) {
    //Function<String, Integer> f = str -> Integer.parseInt(str);
    Function<String, Integer> f = Integer::parseInt;
    int num = f.apply("100");
    System.out.println(num);
  }
}