import java.util.concurrent.*;
public class Test {
  public static void main(String[] args) {
    try {
      BlockingDeque<String> dqueue = new LinkedBlockingDeque<>();
      dqueue.offer("a");
      dqueue.offerFirst("b", 2, TimeUnit.SECONDS);
      dqueue.offerLast("c", 5, TimeUnit.MILLISECONDS);
      System.out.print(dqueue.pollFirst(7, TimeUnit.NANOSECONDS));
      System.out.print(dqueue.pollLast(1, TimeUnit.MILLISECONDS));
    } catch(InterruptedException e) { }
  }
}
