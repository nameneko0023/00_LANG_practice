import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 1, 2);
    // forEach���g�p���Ȃ�
    //for(int a : list){ System.out.print(a); }
    
    // forEach���g�p�A�������_���������ɓn��
    //list.forEach( a -> System.out.print(a) );
    
    // �C���X�^���X���\�b�h�Q��
    list.forEach(System.out::print);
  }
}