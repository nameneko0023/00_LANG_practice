public class Test {
  public static void main(String[] args) {
    Integer num = 100;
    num++;
    assert num != null && num <= 100;
    System.out.println(num);
  }
}
