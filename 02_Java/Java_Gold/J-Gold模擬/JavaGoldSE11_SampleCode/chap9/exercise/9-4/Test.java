import java.io.*;

public class Test {
  public static void main(String[] args) {
    File file = new File("ren");
    foo(file);
  }
  static void foo(File file) {
    if(!file.isFile()){
      File[] files = file.listFiles();
      for(int i = 0; i < files.length; i ++){
        foo(files[i]);
      }
    }else{ file.delete(); }
  }
}
