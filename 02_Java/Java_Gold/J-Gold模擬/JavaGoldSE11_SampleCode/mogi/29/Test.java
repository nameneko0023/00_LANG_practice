import java.util.function.*;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    var myList = Arrays.asList(2.0, 3.0, 4.0);
    UnaryOperator<Double> u = �y   �@   �z;
    myList.replaceAll(u);
    System.out.println(myList);
  }
}