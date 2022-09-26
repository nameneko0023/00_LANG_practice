import java.util.*;
class Foo implements Comparable<Foo>, Comparator<Foo> {
  private String val1; 
  private String val2;
  Foo(String val1, String val2) {
    this.val1 = val1;
    this.val2 = val2;
  }
  public String toString() { 
    return val1; }
  public int compareTo(Foo obj) {
    return val2.compareTo(obj.val2); }
  public int compare(Foo obj1, Foo obj2) {
    int num = Integer.parseInt(obj1.val1) - 
              Integer.parseInt(obj2.val1) ;
    return num; }
}
public class Test {
  public static void main(String[] args) {
    Foo obj1 = new Foo("60", "x");
    Foo obj2 = new Foo("10", "y");
    TreeSet<Foo> set1 = new TreeSet<>();
    set1.add(obj1); set1.add(obj2);
    TreeSet<Foo> set2 = new TreeSet<>(obj1);
    set2.add(obj1); set2.add(obj2);
    System.out.println(set1 + " " + set2);
  }
}
