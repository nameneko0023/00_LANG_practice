import java.util.*;

public class Main {
  public static void main(String[] args) {
    double d1 = 10; // �@ OK：基本データ型暗黙の型変換
    //Double d2 = 10; // �A NG：コンパイルエラー
    
    Long lVal = null;
    //long l_1 = lVal; // �B NG：NullPointerException発生

    Long l_2 = null;
    //l_2++; // �C NG：NullPointerException発生
    
    Map<String, Long> map = new HashMap<>();
    //long l_3 = map.get("H10"); // �D NG：NullPointerException発生
  }
}
