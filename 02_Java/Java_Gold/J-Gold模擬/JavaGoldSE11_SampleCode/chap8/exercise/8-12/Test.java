import java.util.concurrent.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    ExecutorService service = 
               Executors.newScheduledThreadPool(2);
    Stream.generate(() -> "Java")
          .limit(3L)
          .forEach(s -> service.submit(() -> {
                             System.out.print(s + " "); }));
  }
}