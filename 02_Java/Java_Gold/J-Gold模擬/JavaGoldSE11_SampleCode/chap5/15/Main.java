import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    // �����_���@OK
    BiFunction<String, Integer, Character> bf1 = (s, i) -> s.charAt(i); 
    System.out.print(bf1.apply("Java", 2));
    
    // �����_���AOK
    BiFunction<Integer, String, Character> bf2 = (i, s) -> s.charAt(i); 
    System.out.print(bf2.apply(2, "Java"));
    
    // �C���X�^���X���\�b�h�Q�Ƈ@OK
    BiFunction<String, Integer, Character> bf3 = String::charAt;   
    System.out.print(bf3.apply("Java", 2));
    
    // �C���X�^���X���\�b�h�Q�ƇANG
    //BiFunction<Integer, String, Character> bf4 = String::charAt;     
    //System.out.print(bf4.apply(2, "Java"));
  }
}