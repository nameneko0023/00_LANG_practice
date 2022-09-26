import java.text.MessageFormat;

public class Main {
  public static void main(String[] args) {
    String template = "‚±‚ñ‚É‚¿‚Í{0}‚³‚ñB„‚Í{1}‚Å‚·B";
    Object[] params = {"Duke", "Taro"};
    String msg = MessageFormat.format(template, params);
    System.out.println(msg);
  }
}