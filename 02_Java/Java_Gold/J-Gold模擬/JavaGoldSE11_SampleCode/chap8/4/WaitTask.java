public class Main{
  Thread threadA ;
  public static void main(String[] args) {
    new Main().foo();
        try {
      System.out.println("main : sleep 開始");
      Thread.sleep(2000);  // mainスレッドのsleep
      System.out.println("main : sleep 終了");
      threadA.interrupt();  // スレッドへ割り込み
    } catch (InterruptedException e) {
      System.out.println("main : 割り込みをキャッチしました");
    }
  }
  synchronized Thread foo() {
      threadA = new Thread(() -> {
      System.out.println("threadA : sleep 開始");
      try {
        wait();  //ThreadAスレッドのsleep
      } catch (InterruptedException e) {
        System.out.println("threadA : 割り込みをキャッチしました");
      }
      System.out.println("threadA : 処理再開");
    });
    threadA.start();
  }
}
