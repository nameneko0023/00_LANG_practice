import java.text.MessageFormat;

public class Main {
  public static void main(String[] args) {
    String template = "����ɂ���{0}����B����{1}�ł��B";
    Object[] params = {"Duke", "Taro"};
    String msg = MessageFormat.format(template, params);
    System.out.println(msg);
  }
}