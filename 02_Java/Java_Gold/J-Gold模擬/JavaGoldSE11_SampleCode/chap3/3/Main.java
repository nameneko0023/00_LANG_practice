import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      FileReader rf = new FileReader("a.txt");
      rf.read();
    } catch(FileNotFoundException | IOException e) {
    //} catch(IOException | FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
