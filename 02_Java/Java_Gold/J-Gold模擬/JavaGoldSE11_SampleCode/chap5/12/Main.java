import java.util.*;

public class Main {
  public static void main(String[] args) {
    // �����_��
    //Comparator<Integer> comp = (x, y) -> Integer.compare(x, y);
    // static���\�b�h�Q��
    Comparator<Integer> comp = Integer::compare;
    System.out.println(comp.compare(1, 2));
    System.out.println(comp.compare(2, 1));
  }
}