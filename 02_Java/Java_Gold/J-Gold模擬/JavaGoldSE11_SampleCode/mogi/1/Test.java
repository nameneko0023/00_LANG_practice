public class Test {
  public static void main(String[] args) {
    Boolean a = true;
    var b = a.booleanValue();
    long c = 3_000L;
    Long d = c;
    d = null;
    c = d;
  }
}
