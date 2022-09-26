import java.util.concurrent.*;
import java.util.*;
import java.util.stream.*;
public class Test {
  private static Integer num = 0;
  public static void main(String[] args) throws Exception {
    ExecutorService service = Executors.newSingleThreadExecutor();
    List<Future<?>> list = new ArrayList<>();
    IntStream.iterate(0, i -> i + 1).limit(5)
             .forEach(i -> list.add(service.execute(() -> ++num)));
    for(Future<?> r : list){
      System.out.print(r.get() + " ");
    }
    service.shutdown();
  }
}
