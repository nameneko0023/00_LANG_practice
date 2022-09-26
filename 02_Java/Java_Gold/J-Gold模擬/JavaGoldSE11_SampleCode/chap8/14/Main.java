import java.util.concurrent.*;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Future<Date> result = 
        service.submit(() -> new Date());
      System.out.println(result.get());
    } catch(InterruptedException | ExecutionException e ) { 
      e.printStackTrace(); 
    } finally {
      if(service != null) service.shutdown(); 
    }
  }
}
