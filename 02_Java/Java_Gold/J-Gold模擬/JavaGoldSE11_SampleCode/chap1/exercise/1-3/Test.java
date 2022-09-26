public class Test {
  enum Vals { X, Y, Z }
  public static void main(String[] args) {
    Vals data = Vals.Z;
    switch(data) {
      case 0: System.out.print("x ");
      case 1: System.out.print("y ");
      case 2: System.out.print("z ");
      default: System.out.println("other");
    }
  }
}
