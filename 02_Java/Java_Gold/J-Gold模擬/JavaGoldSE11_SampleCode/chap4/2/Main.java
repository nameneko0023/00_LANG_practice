import java.util.*;

public class Main {
  public static void main(String[] args) {
    double d1 = 10; // �@ OK�F��{�f�[�^�^�Öق̌^�ϊ�
    //Double d2 = 10; // �A NG�F�R���p�C���G���[
    
    Long lVal = null;
    //long l_1 = lVal; // �B NG�FNullPointerException����

    Long l_2 = null;
    //l_2++; // �C NG�FNullPointerException����
    
    Map<String, Long> map = new HashMap<>();
    //long l_3 = map.get("H10"); // �D NG�FNullPointerException����
  }
}
