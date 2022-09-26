import java.util.function.Function;

public class Main {
  public static void main(String[] args) {
    // �����N���X���g�p�����ꍇ----------------------
    String str1 = new Function<String, String>() {
      public String apply(String str) {
        return "Hello " + str;
      }
    }.apply("naoki");
    System.out.println("�����N���X" + str1);
    
    // �����_���i�ȗ��Ȃ��j--------------------------
    Function<String, String> f2 = (String str) -> {
      return "Hello " + str;
    };
    String str2 = f2.apply("naoki");
    System.out.println("�����_���i�ȗ��Ȃ��j" + str2);
    
    // �����_���i�ȗ�����j--------------------------
    Function<String, String> f3 = str -> "Hello " + str;
    String str3 = f3.apply("naoki");
    System.out.println("�����_���i�ȗ�����j" + str3);
  }
}