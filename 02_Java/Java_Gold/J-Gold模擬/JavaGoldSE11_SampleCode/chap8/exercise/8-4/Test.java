import java.util.concurrent.atomic.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class Test {  
  public static void main(String[] args) {
    int num = 0;
    IntStream.iterate(1, i -> 1)
             .limit(100)
             .parallel().forEach(i -> ++num);
    System.out.println(num);
  }
}

