import java.io.*;

public class Main {
  public static void main(String[] args) {
    Employee writeEmp = new Employee(100, "tanaka");
    try (ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("data.txt"));
         ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("data.txt"))) {
      oos.writeObject(writeEmp); // èëÇ´èoÇµ
      Employee readEmp = (Employee)ois.readObject(); // ì«Ç›çûÇ›
      System.out.println("ID  : " + readEmp.getId());
      System.out.println("Name: " + readEmp.getName());
    } catch (ClassNotFoundException | IOException e) {
      e.printStackTrace();
    }
  }
}
