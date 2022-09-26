import java.util.concurrent.*;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    ScheduledExecutorService service = null;
    try {
      service = Executors.newSingleThreadScheduledExecutor();
      Runnable task = () -> System.out.println(new Date());
      service.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);
      Thread.sleep(10000);
    } catch(InterruptedException e) { 
      e.printStackTrace(); 
    } finally {
      if(service != null) service.shutdown(); 
    }
  }
}
