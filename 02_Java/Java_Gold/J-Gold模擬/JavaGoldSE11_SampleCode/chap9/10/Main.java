import java.io.*;

public class Main {
  public static void main(String[] args) {
    Console console = System.console();
    PrintWriter pw = console.writer();
    while(true){
      String str = console.readLine();
      if(str.equals("")){ break; }
      pw.append(" 入力されたデータ : " + str + '\n');
      //pw.write(" 入力されたデータ : " + str + '\n');
      pw.flush();
    }
  }
}
