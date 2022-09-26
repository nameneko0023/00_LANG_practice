import java.util.*;
public class Test {
  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();
    deque.push("A"); deque.push("B"); deque.push("C");
    deque.pop();
    deque.peek();
    while(deque.remove() != null) {
      System.out.print(deque.pop());
    }
  }
}
