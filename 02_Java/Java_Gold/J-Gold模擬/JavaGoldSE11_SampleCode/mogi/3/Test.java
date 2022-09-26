public class Test {
  private int num = 100;
  public void show() {
    String str = "num : ";
    class Foo {
      private int num = Test.this.num;
      public void show() {
        num += 100;
        System.out.println(str + num);
      }
    }
    new Foo().show();
  }
  public static void main(String[] args) {
    new Test().show();
  }
}
