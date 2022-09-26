import java.util.Locale;
import java.text.NumberFormat;

public class Main {
  public static void main(String[] args) {
    NumberFormat jpNum = NumberFormat.getInstance(); // ���{
    NumberFormat jpCur = NumberFormat.getCurrencyInstance();
    System.out.println("���{�̐��l : " + jpNum.format(50000));
    System.out.println("���{�̒ʉ� : " + jpCur.format(50000));
    NumberFormat usNum = NumberFormat.getInstance(Locale.US); // �č�
    NumberFormat usCur = NumberFormat.getCurrencyInstance(Locale.US);
    System.out.println("�č��̐��l : " + usNum.format(50000));
    System.out.println("�č��̒ʉ� : " + usCur.format(50000));
  }
}
