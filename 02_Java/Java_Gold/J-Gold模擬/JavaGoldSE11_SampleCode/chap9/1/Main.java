import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileOutputStream fos = null;
    FileInputStream fis = null;
    try {
      fos = new FileOutputStream(new File("data.txt"));
      fos.write(0); fos.write("abc".getBytes()); fos.write(99);
      fis = new FileInputStream(new File("data.txt"));
      int data = 0;
      while((data = fis.read()) != -1){
        System.out.print(data + " ");   // �ǂݍ��񂾃f�[�^�̕\��
      }
    } catch (FileNotFoundException e) {
      System.err.println(" �t�@�C��������܂���");
    } catch (IOException e) {
      System.err.println("IO Error");
    } finally {
      try { fos.close(); fis.close(); } catch(IOException e) { }
    }
  }
}
