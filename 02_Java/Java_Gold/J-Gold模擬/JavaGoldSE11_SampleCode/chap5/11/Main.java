import java.util.*;
import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(3, 1, 2);
    /* �����N���X���g�p�����ꍇ
    Consumer<List<Integer>> con1 = new Consumer<List<Integer>>() {
      public void accept(List<Integer> list) {
        Collections.sort(list);
      }
    };  */ 
    /* �����_��  
    Consumer<List<Integer>> con1 = 
               lambdaList -> Collections.sort(lambdaList); */
    
    // static���\�b�h�Q��
    Consumer<List<Integer>> con1 = Collections::sort;
    
    con1.accept(list);  System.out.println(list);
  }
}