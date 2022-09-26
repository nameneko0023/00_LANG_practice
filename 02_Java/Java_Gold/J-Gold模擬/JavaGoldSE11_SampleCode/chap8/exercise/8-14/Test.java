import java.util.concurrent.*;
import java.util.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    ExecutorService service = Executors.newSingleThreadExecutor();
    try {
      List<Future<?>> list = new ArrayList<>();
      IntStream.range(0, 10)
               .forEach(i -> list.add(
                             service.submit(() -> foo(i))));
      list.stream().forEach(f -> show(f));
    } finally {
      service.shutdown();
    }
  }
  static Integer foo(int num) {
    Åy   á@   Åz
  }
  static void show(Future<?> f) {
    try {
      System.out.print(f.get() + " ");
    } catch(Exception e) { System.out.print("error "); }
  }
}
