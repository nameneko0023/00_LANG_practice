import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      int a = 10/0;
      FileReader rf = new FileReader("a.txt");
      rf.read();
    } catch( ArithmeticException | FileNotFoundException e) {
      e = null;
    } catch(IOException e) {
      e = null;
    }
  }
}
