import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
public class Test {
  private static AtomicInteger val1 = new AtomicInteger();
  private static int val2 = 0;
  public static void main(String[] args) 
                            throws InterruptedException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      for(int i = 0; i < 100; i++){
        service.execute(() -> {
          val1.getAndIncrement(); val2++; });
      }
      Thread.sleep(500);
      System.out.println(val1 + " " + val2);
    } finally {
      service.shutdown();
    }
  }
}
