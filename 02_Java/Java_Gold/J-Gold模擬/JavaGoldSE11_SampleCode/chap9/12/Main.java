import java.util.Formatter;

public class Main {
  public static void main(String[] args) {
    String compName = "SE��" ;
    String name = "tanaka";
    int age = 20;
    Formatter fm = new Formatter();
    fm.format("��Ж��� %s �ł��B\n", compName);
    fm.format("���O : %2$s : �N�� : %1$d \n", age, name);
    System.out.println(fm);
    System.out.format("��Ж��� %s �ł��B\n", compName);
    System.out.printf("���O : %2$s : �N�� : %1$d \n", age, name);
  }
}
