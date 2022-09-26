import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    // Stringクラスのインスタンスメソッドであるlength()
    //Function<String, Integer> f1 = s -> s.length();
    Function<String, Integer> f1 = String::length;
    System.out.println(f1.apply("Java"));

    // StringクラスのstaticメソッドであるvalueOf(int)
    //Function<Integer, String> f2 = s -> String.valueOf(s);
    Function<Integer, String> f2 = String::valueOf;
    System.out.println(f2.apply(10));
    
    // IntegerクラスのインスタンスメソッドであるhashCode()
    Function<Integer, Integer> f3 = i -> i.hashCode();
    System.out.println(f3.apply(10));
    
    Function<Integer, Integer> f4 = Integer::hashCode;
  }
}