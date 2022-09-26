import java.util.*;

public class Test {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("a"); 
    list.add(10);
    for(String s : list){ System.out.print(s + " "); }
  }
}
