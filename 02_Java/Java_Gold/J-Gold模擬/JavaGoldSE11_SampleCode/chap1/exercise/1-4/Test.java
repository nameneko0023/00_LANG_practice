public class Test {
  enum Vals { X , 
              Y{ int method() { return 20; } },
              Z;
              abstract int method();
  }
  public static void main(String[] args) {
    System.out.print(Vals.Y + " ");
    System.out.print(Vals.Y.method());
  }
}
