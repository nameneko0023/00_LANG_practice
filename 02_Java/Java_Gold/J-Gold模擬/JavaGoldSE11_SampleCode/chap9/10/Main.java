import java.io.*;

public class Main {
  public static void main(String[] args) {
    Console console = System.console();
    PrintWriter pw = console.writer();
    while(true){
      String str = console.readLine();
      if(str.equals("")){ break; }
      pw.append(" ���͂��ꂽ�f�[�^ : " + str + '\n');
      //pw.write(" ���͂��ꂽ�f�[�^ : " + str + '\n');
      pw.flush();
    }
  }
}
