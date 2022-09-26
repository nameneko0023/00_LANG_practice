import java.io.*;

public class Test {
  public static void main(String[] args) {
    try {
       bar();
    } catch (IOException e) { e.printStackTrace(); }
  }
  static void bar() throws IOException {
    try(BufferedReader br =
          new BufferedReader(new FileReader("memo.txt"))) {
      System.out.println(br.readLine());
    }
  }
}
