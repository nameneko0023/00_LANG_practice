import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[ ] ary1 = { 3, 1, 2 };
    print(ary1); System.out.println();
    Arrays.sort(ary1);
    print(ary1); System.out.println();
    Object[ ] ary2= { "aa", 10 };
    //Arrays.sort(ary2);
  }
  public static void print(int[] ary) {
    for(int num : ary){ System.out.print(num + " "); }
  }
}
