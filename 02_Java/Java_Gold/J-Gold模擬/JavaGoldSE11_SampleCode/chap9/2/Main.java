import java.io.*;

public class Main {
  public static void main(String[] args) {
    try (FileOutputStream fos =
                  new FileOutputStream(new File("data.txt"));
         FileInputStream fis =
                  new FileInputStream(new File("data.txt"))) {
      fos.write(0); fos.write("abc".getBytes()); fos.write(99);
      int data = 0;
      while((data = fis.read()) != -1){
        // �ǂݍ��񂾃f�[�^�̕\��
        System.out.print(data + " ");
      }
    } catch (FileNotFoundException e) {
      System.err.println(" �t�@�C��������܂���");
    } catch (IOException e) {
      System.err.println("IO Error");
    }
  }
}
