import java.util.*;
public class Main {
  public static void main(String[] args) {
    TreeSet<String> set = new TreeSet<String>();
    set.add("C"); set.add("A"); set.add("B");
    Iterator<String> iter = set.iterator();
    while(iter.hasNext()){ System.out.print(iter.next() + " "); }
  }
}
