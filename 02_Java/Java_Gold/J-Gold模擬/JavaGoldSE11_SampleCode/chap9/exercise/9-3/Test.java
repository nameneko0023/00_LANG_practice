import java.io.*;

public class Test {
  public static void main(String[] args) {
    Console console = System.console();
    PrintWriter pw = console.writer();
    String str = console.readLine();
    if(str != null) pw.append(str);
    pw.flush();
  }
}
