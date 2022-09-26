import java.util.*;

public class Main {
  public static void main(String[] args) {
    Queue<String> queue = new ArrayDeque<String>();
    queue.offer("1"); queue.offer("2");
    for(String s : queue){ queue.poll(); }
    System.out.println(queue.peek());     // null‚ª•Ô‚é
    //System.out.println(queue.element());  // —áŠO‚ªƒXƒ[
  }
}

