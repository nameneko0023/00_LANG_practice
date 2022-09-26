import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 1, 2);
    // forEachを使用しない
    //for(int a : list){ System.out.print(a); }
    
    // forEachを使用、かつラムダ式を引数に渡す
    //list.forEach( a -> System.out.print(a) );
    
    // インスタンスメソッド参照
    list.forEach(System.out::print);
  }
}