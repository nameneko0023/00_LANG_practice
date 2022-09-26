import java.util.*;

public class Test {
  public static void main(String[] args) {
    ResourceBundle bundle
            = ResourceBundle.getBundle("MyResources", Locale.US);
    
    /*  //A
    bundle.keys()
          .stream()
          .map(k -> bundle.getString(k))
          .forEach(System.out::println);
    */
    
    /*  //B
    bundle.keys()
          .stream()
          .map(k -> k)
          .forEach(System.out::println);
    */
    
    /*  //C
    bundle.stream()
          .map(k -> bundle.getString(k))
          .forEach(System.out::println);
    */
    
    /*  //D
    bundle.stream()
          .map(k -> k)
          .forEach(System.out::println);
    */
    
    /*  //E
    bundle.keySet()
          .stream()
          .map(k -> bundle.getString(k))
          .forEach(System.out::println);
    */
    
    /*  //F
    bundle.keySet()
          .stream()
          .map(k -> k)
          .forEach(System.out::println);
    */
    
  }
}
