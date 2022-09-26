import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    long result1 = Stream.of("a", "b", "c").count();
    System.out.println(result1);
    Stream<String> stream1 = Stream.of("a", "b", "c");
    stream1.forEach(System.out::print);
    //for(String s : stream1){ System.out.print(s); }
  }
}
