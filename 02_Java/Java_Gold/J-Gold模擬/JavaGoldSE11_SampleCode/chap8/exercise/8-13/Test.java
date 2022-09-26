import java.util.concurrent.*;
import java.util.Date;

public class Test {
  public static void main(String[] args) {
    ExecutorService service = null; 
    try {
      service = Executors.newSingleThreadScheduledExecutor();
      Callable task = () -> System.out.println(new Date());
      service.scheduleWithFixedDelay(task, 1, 2, TimeUnit.SECONDS);
    } finally {
      if(service != null) service.shutdown(); 
    }
  }
}
