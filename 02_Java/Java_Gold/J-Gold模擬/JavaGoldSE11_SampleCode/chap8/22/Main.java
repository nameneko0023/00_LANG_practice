import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;  
public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("commonPool : " + ForkJoinPool.commonPool()
                                                     .getParallelism());
    IntStream.range(0, 100).parallel()
             .forEach(i -> System.out.println(
                        Thread.currentThread().getName() + ": " + i));
  }
}
