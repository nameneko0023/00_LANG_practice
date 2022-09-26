import java.io.*;
public class Test {
  public static void main(String[] args) throws IOException {
    BufferedInputStream bi = 
           new BufferedInputStream(new FileInputStream("t.txt"));
    FileInputStream in = new FileInputStream("t.txt");
    foo(bi);  
    foo(in);
  }
  public static void foo(InputStream stream) throws IOException {
    for(int i = 0; i < 3; i++) stream.read();
    stream.mark(10);
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < 5; i++) sb.append((char)stream.read());
    stream.reset();
    stream.skip(1);
    sb.append((char)stream.read());
    System.out.println(sb.toString());
  }
}
