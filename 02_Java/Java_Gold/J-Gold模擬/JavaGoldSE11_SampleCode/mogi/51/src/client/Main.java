package app;
import com.seshop.BookInfo;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {  
  public static void main(String[] args) {
    ServiceLoader<BookInfo> loader = Åy   á@   Åz;
    Iterator<BookInfo> iter = loader.iterator();
    while (iter.hasNext()) {
      BookInfo obj = iter.next();
      System.out.println(obj.sayTitle());
    }
  }
}