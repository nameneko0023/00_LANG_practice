import java.util.*;

public class Main {
  public static void main(String[] args) {
    double d1 = 10; // ① OK：基本データ型暗黙の型変換
    //Double d2 = 10; // ② NG：コンパイルエラー
    
    Long lVal = null;
    //long l_1 = lVal; // ③ NG：NullPointerException発生

    Long l_2 = null;
    //l_2++; // ④ NG：NullPointerException発生
    
    Map<String, Long> map = new HashMap<>();
    //long l_3 = map.get("H10"); // ⑤ NG：NullPointerException発生
  }
}
