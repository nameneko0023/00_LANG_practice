enum Vals {
  //A, B; // コンパイルエラー
  A { void foo() { System.out.println("A"); } },
  B { void foo() { System.out.println("B"); } };
  abstract void foo();
}
public class Main {
  public static void main(String[] args) {
    Vals obj = Vals.A;
    obj.foo();
  }
}
