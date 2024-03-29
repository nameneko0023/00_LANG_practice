import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("Tanaka", "Sato");
    /*  // 匿名クラスで実装した場合
    words.replaceAll(new UnaryOperator<String>() {
      public String apply(String str) {
        return str.toUpperCase();
      }
    });  */
    words.replaceAll( (String str) -> { return str.toUpperCase(); } );
    //words.replaceAll( (var str) -> { return str.toUpperCase(); } );
    System.out.println(words);
  }
}