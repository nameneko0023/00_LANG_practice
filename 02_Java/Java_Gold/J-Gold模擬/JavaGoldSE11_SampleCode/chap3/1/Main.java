public class Main {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int[] ary = {10, 20, 30};
    try {
      for(int i = 0; i < num; i++){
        System.out.println("ary :" + ary[i]);
      } 
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
    } finally {
      System.out.println("finally ‚ÌŽÀs");
    }
    System.out.println("end");
  }
}
