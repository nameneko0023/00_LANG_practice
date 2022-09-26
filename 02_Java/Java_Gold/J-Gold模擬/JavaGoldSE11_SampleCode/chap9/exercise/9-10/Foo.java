import java.io.Serializable;
import java.util.*;
public class Foo implements Serializable {
  private static final long serialUID = 1L;
  private transient String val1 = "abc";
  private static String val2 = "xyz";
  private transient Integer val3 = null;
  private List<String> val4 = new ArrayList<>();
  private Object val5 = null;
  public Foo() { this.val1 = "other"; }
  // ˆÈ~‚ÉŠeƒƒ“ƒo•Ï”‚Ì public ‚È setter/getter ‚ª’è‹`‚³‚ê‚Ä‚¢‚é‚à‚Ì‚Æ‚·‚é
}
