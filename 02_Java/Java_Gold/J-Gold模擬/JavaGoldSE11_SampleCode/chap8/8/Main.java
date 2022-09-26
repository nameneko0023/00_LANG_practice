import java.util.concurrent.*;

public class Main {
  public static void main(String[] args) {
    BlockingQueue<Double> queue = new LinkedBlockingQueue<>(3);
    new Thread(() -> { // �L���[�ɗv�f��ǉ�����X���b�h
      while(true){
        try {
          queue.offer(Math.random(), 2, TimeUnit.SECONDS);
          System.out.println("offer() : " + queue.size());
        } catch (InterruptedException e) { e.printStackTrace(); } 
      }  
    }).start();
    
    new Thread(() -> { // �L���[����v�f���擾����э폜����X���b�h
      while(true){
        try { 
          double pNum = queue.poll(2, TimeUnit.SECONDS);
          System.out.println("poll() : " + pNum);
        } catch (InterruptedException e) { e.printStackTrace(); } 
      }  
    }).start();
  }
}
