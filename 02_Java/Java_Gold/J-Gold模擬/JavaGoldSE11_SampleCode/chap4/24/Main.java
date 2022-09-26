import java.util.*;

public class Main {
  public static void main(String[] args) {
    String[ ] ary = {"A","B","C"};
    List<String> list = Arrays.asList(ary);
    //list.add("D");
    list.set(2, "D");
    for(String str : list){
      System.out.print(str + " ");
    }
  }
}
