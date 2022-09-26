import java.util.function.*;
import java.util.*;

public class Test {
  public static void main(String[] args) {
    BiFunction<List<Character>, Character, Boolean> f 
                            = (list, c) -> list.add(c);
    List<Character> list = new ArrayList<>();
    f.apply(list, 'g');
    System.out.println(list);
  }
}