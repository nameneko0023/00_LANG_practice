import java.util.concurrent.*;
public class Test {
  public static void main(String[] args) throws Exception {
    Object obj1 = new Object();
    Object obj2 = new Object();
    ExecutorService service = Executors.newFixedThreadPool(2);
    Future<?> result1 = 
      service.submit(() -> {
        synchronized(obj1) {
          synchronized(obj2) { System.out.println("hello"); }
        }
      });
    Future<?> result2 = 
      service.submit(() -> {
        synchronized(obj2) {
          synchronized(obj1) { System.out.println("bye"); }
        }
      });
    System.out.println(result1.get() + " " + result2.get());
  }
}
