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
    //static void methodA() {   // 12行目の代わりにこの書き方でもOK
      throw new ArrayStoreException();
  }
  static void methodB() throws IOException {
  //static void methodB() { // これはコンパイルエラー
    throw new IOException();
  }
}
