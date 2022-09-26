import java.io.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedWriter bw =
          new BufferedWriter(new FileWriter("data.txt"));
        BufferedReader br =
          new BufferedReader(new FileReader("data.txt"))) {
      bw.write("���͂悤"); bw.newLine(); bw.write("����ɂ���");
      bw.flush();
      String data = null;
      while((data = br.readLine()) != null){
        System.out.println(data);
      }
    } catch (IOException e) { e.printStackTrace(); }
  }
}
