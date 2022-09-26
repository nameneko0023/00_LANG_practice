import java.util.*;

public class Main {
  //@SuppressWarnings(value = {"unchecked", "deprecation"})
  //@SuppressWarnings({"unchecked", "deprecation"})
  public static void main(String[] args) {
    
    // @Deprecatedが付与されたコンストラクタの利用
    Date date = new Date("2021/03/15");

    // <>による型が未指定
    List list = new ArrayList();
  }
}
