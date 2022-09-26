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
  // 以降に各メンバ変数の public な setter/getter が定義されているものとする
}
