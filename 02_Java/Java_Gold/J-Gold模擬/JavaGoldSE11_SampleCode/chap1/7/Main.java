enum Vals {
  //A, B; // �R���p�C���G���[
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
