import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    ExecutorService service =Executors.newSingleThreadExecutor();
    try {
       List<Future<Object>> list = new ArrayList<>();
       Stream.iterate(null, i -> i)
                .limit(3)
                .forEach( i -> list.add(
                        service.exec(() -> i)));
       for(Future<?> data : list){
          System.out.print(data.get() + " "); 
       }
    } catch(InterruptedException | ExecutionException e) {
      e.printStackTrace();
    } finally {
       if(service != null) service.shutdown();
    } 
  } 
}
