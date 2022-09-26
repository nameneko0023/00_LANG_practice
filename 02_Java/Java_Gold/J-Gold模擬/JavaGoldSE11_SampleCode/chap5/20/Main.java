import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    //ToIntFunction<String> f1 = s -> s.length();
    ToIntFunction<String> f1 = String::length;
    int ans1 = f1.applyAsInt("Java");
    //Integer ans1 = f1.applyAsInt("Java"); // OK
    
    //IntToDoubleFunction f2 = i -> i * 1.08;
    IntToDoubleFunction f2 = (int i) -> { return i * 1.08; };
    //IntToDoubleFunction f2 =
                   //(Integer i) -> { return i * 1.08; }; // NG
    double ans2 = f2.applyAsDouble(1000);
  }
}