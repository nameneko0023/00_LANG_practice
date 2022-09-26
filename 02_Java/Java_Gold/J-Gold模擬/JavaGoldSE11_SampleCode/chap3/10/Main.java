import java.sql.*;
class MyResource implements AutoCloseable {
  private String msg;
  public MyResource(String msg) { this.msg = msg; }
  public void method() throws SQLException {
    throw new SQLException("method() �ł̃G���[");
  }
  public void close() throws SQLException {
    System.out.println("close() : "+ msg);
    throw new SQLException("close() �ł̃G���[ : " + msg);
  }
}
public class Main {
  public static void main(String[] args) {
    try (MyResource obj1 = new MyResource("obj1");
         MyResource obj2 = new MyResource("obj2")) {
      obj1.method();
    } catch (SQLException e) {
      System.out.println("e.getMessage() : " + e.getMessage());
      System.out.println("e.getSuppressed()�Ŏ��o�������");
      Throwable[] errAry = e.getSuppressed();
      System.out.println("  �}����O�� : " + errAry.length);
      for(Throwable ex : errAry){
        System.out.println("  " + ex.getMessage());
      }
    } finally {
      System.out.println("finally �u���b�N");
    }
  }
}
