import java.util.function.Function;

public class Main {
  int a = 10;
  public void method() {
    final int b = 20;
    int c = 30;   // �����Ifinal
    int d = 40;
    d = 50;
    int e = 60;   // �����Ifinal
    Function<String, String> f1 = (String str) -> {
      System.out.println("a : " + a);
      System.out.println("b : " + b);
      System.out.println("c : " + c);
      //System.out.println("d : " + d);  // �R���p�C���G���[
      //e = 100;   // �R���p�C���G���[
      return "Hello " + str;
    };
    System.out.println(f1.apply("naoki"));
  }
  public static void main(String[] args) {
    new Main().method();
  }
}