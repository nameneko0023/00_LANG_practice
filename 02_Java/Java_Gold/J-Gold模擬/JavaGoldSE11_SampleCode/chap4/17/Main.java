interface MyIn<T> { void method(T t); }
class Foo implements MyIn<String> { // �����N���X�̒�`
  public void method(String s) { System.out.println(s); } }
public class Main {
  public static void main(String[] args) {
    new Foo().method("ABC"); 
    new MyIn<Integer>() { // �����N���X���g�p����������
      public void method(Integer i) { System.out.println(i); }
    } .method(100);
  }
}
