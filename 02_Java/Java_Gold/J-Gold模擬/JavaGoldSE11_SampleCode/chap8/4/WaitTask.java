public class Main{
  Thread threadA ;
  public static void main(String[] args) {
    new Main().foo();
        try {
      System.out.println("main : sleep �J�n");
      Thread.sleep(2000);  // main�X���b�h��sleep
      System.out.println("main : sleep �I��");
      threadA.interrupt();  // �X���b�h�֊��荞��
    } catch (InterruptedException e) {
      System.out.println("main : ���荞�݂��L���b�`���܂���");
    }
  }
  synchronized Thread foo() {
      threadA = new Thread(() -> {
      System.out.println("threadA : sleep �J�n");
      try {
        wait();  //ThreadA�X���b�h��sleep
      } catch (InterruptedException e) {
        System.out.println("threadA : ���荞�݂��L���b�`���܂���");
      }
      System.out.println("threadA : �����ĊJ");
    });
    threadA.start();
  }
}
