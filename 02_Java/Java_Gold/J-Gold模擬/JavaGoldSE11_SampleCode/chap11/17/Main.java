import java.text.MessageFormat;

public class Main {
  public static void main(String[] args) {
    String template = "‚±‚ñ‚É‚¿‚Í{0}‚³‚ñB„‚Í{1}‚Å‚·B";
    Object[][] params = {{"Duke", "Taro"},
                         {"Nao", "misa"}};
    MessageFormat mf = new MessageFormat(template);
    for(Object[] p : params){
      System.out.println(mf.format(p));
    }
  }
}