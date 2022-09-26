import java.util.*;
import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("Tanaka", "Sato");
    words.replaceAll( str -> str.toUpperCase() );
    System.out.println(words);
  }
}