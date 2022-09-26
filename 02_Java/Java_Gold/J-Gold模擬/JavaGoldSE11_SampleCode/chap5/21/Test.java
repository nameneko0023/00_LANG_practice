import java.util.function.*;

public class Test {
  public static void main(String[] args) {
    Function<String,Character> f1 = s -> s.charAt(0);
    Function<Character,Boolean> f2 =
                       c -> Character.isUpperCase(c);
    // andThen�̗��p�i���g.andThen(after)�j
    Function<String,Boolean> f3 = f1.andThen(f2);
    System.out.println(f3.apply("Java"));
    
    // compose�̗��p�i���g.compose(before)�j
    Function<String,Boolean> f4 = f2.compose(f1);
    //Function<String,Boolean> f4 = f1.compose(f2);
    System.out.println(f4.apply("Java"));
  }
}
