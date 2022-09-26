class Gen<T extends Number> {
  private T var;
  public Gen(T var) { this.var = var; }
  public void display() { System.out.println(var); }
}
public class Main {
  public static void main(String[] args) {
    // Integer������Gen�I�u�W�F�N�g�̐���
    Gen<Integer> g1 = new Gen<>(100);
    g1.display();
    // Double������Gen�I�u�W�F�N�g�̐���
    Gen<Double> g2 = new Gen<>(3.14);
    g2.display();
    //Gen<String> g3 = new Gen<>("abc");
  }
}
