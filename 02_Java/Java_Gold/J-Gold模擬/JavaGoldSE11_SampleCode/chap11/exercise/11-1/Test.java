import java.util.*;

public class Test {
  public static void main(String[] args) {
    // Locale  lc  = Locale.US;  // A
    // Locale  lc  = new Locale.US; // B
    // Locale  lc  = new Locale(Locale.US); // C
    // Locale lc = new Locale.Builder().setLanguage("sr") // D
    //                  .setScript("Latn").setRegion("RS").build();
    //  Locale lc = new Locale().Builder().setLanguage("sr") // E
    //                .setScript("Latn").setRegion("RS").build();
    //  Locale lc = new Locale().Builder().setLanguage("sr") // F
    //                .setScript("Latn").setRegion("RS");
  }
}
