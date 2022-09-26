import java.io.*;

public class Test {
  public static void main(String[] args) {
    Bar obj = new Bar();
    try (ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("t.txt"));
         ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("t.txt"))){
      oos.writeObject(obj); 
      Bar read = (Bar)ois.readObject();
      System.out.println(read.data);
    } catch (ClassNotFoundException | IOException e){
      e.printStackTrace();
    }
  }
}
