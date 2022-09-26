public class Main {
  public static void main(String[] args) {
    int i1 = 100;
    Integer obj = i1; // Boxing
    int i2 = obj;     // Unboxing
    method(i2);       // intŒ^‚Åƒƒ\ƒbƒh‚Ìˆø”‚É“n‚·
  }
  static void method(Integer obj) { // IntegerŒ^‚Åó‚¯æ‚é
    int i = obj + 100; // ŒvZ‚à‰Â”\
    System.out.println(i);
  }
}
