import java.text.MessageFormat;

public class Main {
  public static void main(String[] args) {
    String template = "����ɂ���{0}����B����{1}�ł��B";
    Object[][] params = {{"Duke", "Taro"},
                         {"Nao", "misa"}};
    MessageFormat mf = new MessageFormat(template);
    for(Object[] p : params){
      System.out.println(mf.format(p));
    }
  }
}