import java.util.concurrent.*;
import java.util.stream.*;
public class Test {
  static void exec(CyclicBarrier c) {
    try {
      c.await();
      System.out.println("hey");
    } catch(BrokenBarrierException | InterruptedException e) { }
  }
  public static void main(String[] args) {
    CyclicBarrier c = new CyclicBarrier(5, 
                                  () -> System.out.print("task "));
    IntStream.iterate(0, i -> i+1).limit(3)
             .parallel().forEach(i -> exec(c));
  }
}
