public class Main {
  public static void main(String[] args) {
    // �X���b�h�̍쐬
    ThreadA a = new ThreadA();
    ThreadB b = new ThreadB();
    // �X���b�h�̎��s�J�n
    a.start();
    b.start();
  }
}
class ThreadA extends Thread { // �X���b�h�N���X
  public void run() {     // �X���b�h�����s���鏈��
    for(int i = 0; i < 5; i++){
      System.out.print("A:" + i + " ");
    }
  }
}
class ThreadB extends Thread { // �X���b�h�N���X
  public void run() {     // �X���b�h�����s���鏈��
    for(int i = 0; i < 5; i++){
      System.out.print("B:" + i + " ");
    }
  }
}
