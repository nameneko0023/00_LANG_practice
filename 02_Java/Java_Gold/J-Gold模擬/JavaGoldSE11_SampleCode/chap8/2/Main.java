public class Main {
  public static void main(String[] args) {
    // �X���b�h�̍쐬
    Thread a = new Thread(new ThreadA());
    Thread b = new Thread(new ThreadB());
    // �X���b�h�̎��s�J�n
    a.start();
    b.start();
  }
}
// Runnable�C���^�t�F�[�X�̎����N���X
class ThreadA implements Runnable {
  public void run() {     // �X���b�h�����s���鏈��
    for(int i = 0; i < 5; i++){
      System.out.print("A:" + i + " ");
    }
  }
}
// Runnable�C���^�t�F�[�X�̎����N���X
class ThreadB implements Runnable {
  public void run() {     // �X���b�h�����s���鏈��
    for(int i = 0; i < 5; i++){
      System.out.print("B:" + i + " ");
    }
  }
}
