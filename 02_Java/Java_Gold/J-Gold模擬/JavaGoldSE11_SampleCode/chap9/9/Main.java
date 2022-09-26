import java.io.*;

class Foo {
  int a;
  Foo() {
    a = 10;
    System.out.println("Foo()");
  }
}
class Bar extends Foo implements Serializable {
  int b;
  Bar() { 
    b = 100;
    System.out.println("Bar()");
  }
}
public class Main {
  public static void main(String[] args) {
    Bar bar = new Bar();
    bar.a = 100;
    bar.b = 100;
    try (ObjectOutputStream oos = new ObjectOutputStream(
                 new FileOutputStream("data.txt"));
         ObjectInputStream ois = new ObjectInputStream(
                 new FileInputStream("data.txt"))) {
      oos.writeObject(bar); // シリアライズ
      Bar readBar = (Bar)ois.readObject(); // デシリアライズ
      System.out.println("readBar.a + : " + readBar.a);
      System.out.println("readBar.b + : " + readBar.b);
    } catch (ClassNotFoundException | IOException e) {
      e.printStackTrace();
    }
  }
}
