import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      methodA();
      methodB();
    } catch(ArrayStoreException | IOException e) {
      System.out.println(e);
    }
  }
  static void methodA() throws ArrayStoreException {
    //static void methodA() {   // 12�s�ڂ̑���ɂ��̏������ł�OK
      throw new ArrayStoreException();
  }
  static void methodB() throws IOException {
  //static void methodB() { // ����̓R���p�C���G���[
    throw new IOException();
  }
}
