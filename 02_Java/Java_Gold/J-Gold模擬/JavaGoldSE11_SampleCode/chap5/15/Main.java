import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    // ラムダ式①OK
    BiFunction<String, Integer, Character> bf1 = (s, i) -> s.charAt(i); 
    System.out.print(bf1.apply("Java", 2));
    
    // ラムダ式②OK
    BiFunction<Integer, String, Character> bf2 = (i, s) -> s.charAt(i); 
    System.out.print(bf2.apply(2, "Java"));
    
    // インスタンスメソッド参照①OK
    BiFunction<String, Integer, Character> bf3 = String::charAt;   
    System.out.print(bf3.apply("Java", 2));
    
    // インスタンスメソッド参照②NG
    //BiFunction<Integer, String, Character> bf4 = String::charAt;     
    //System.out.print(bf4.apply(2, "Java"));
  }
}