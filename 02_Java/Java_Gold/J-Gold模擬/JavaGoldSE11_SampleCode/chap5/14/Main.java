import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    //UnaryOperator<String> obj = s -> s.toUpperCase(); // �����_��
    //UnaryOperator<String> obj = s::toUpperCase;     // �R���p�C���G���[
    UnaryOperator<String> obj = String::toUpperCase; 
    System.out.println(obj.apply("naoki"));
  }
}