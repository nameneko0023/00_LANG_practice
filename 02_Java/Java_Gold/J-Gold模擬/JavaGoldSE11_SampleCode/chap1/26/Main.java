class Outer {  // �O���̃N���X
  private int num = 100;
  class A {  // ��static�N���X
    public int num = 200;
    void method(int num) {
      num += 1;
      this.num += 1;
      Outer.this.num += 1;
      System.out.println("num : " + num);
      System.out.println("this.num : " + this.num);
      System.out.println("Outer.this.num : " + Outer.this.num);
    }
  }
}
public class Main {  // �O���̃N���X
  public static void main(String[] args) {
    new Outer().new A().method(300);
  }
}
