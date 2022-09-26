import java.io.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedWriter bw =
          new BufferedWriter(new FileWriter("data.txt"));
        BufferedReader br =
          new BufferedReader(new FileReader("data.txt"))) {
      bw.write("‚¨‚Í‚æ‚¤"); bw.newLine(); bw.write("‚±‚ñ‚É‚¿‚Í");
      bw.flush();
      String data = null;
      while((data = br.readLine()) != null){
        System.out.println(data);
      }
    } catch (IOException e) { e.printStackTrace(); }
  }
}
